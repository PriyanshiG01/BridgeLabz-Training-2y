package oops;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

enum Coverage { HEALTH, AUTO, HOME, LIFE }

class Policy implements Comparable<Policy> {
    private final String policyNumber;
    private final String holderName;
    private final LocalDate expiryDate;
    private final Coverage coverage;
    private final double premium;

    public Policy(String policyNumber, String holderName, LocalDate expiryDate, Coverage coverage, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverage = coverage;
        this.premium = premium;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getHolderName() { return holderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public Coverage getCoverage() { return coverage; }
    public double getPremium() { return premium; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return Objects.equals(policyNumber, p.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy o) {
        int cmp = this.expiryDate.compareTo(o.expiryDate);
        if (cmp != 0) return cmp;
        return this.policyNumber.compareTo(o.policyNumber);
    }

    @Override
    public String toString() {
        return String.format("Policy[%s, %s, %s, %s, %.2f]",
            policyNumber, holderName, expiryDate, coverage, premium);
    }
}

class PolicyManager {
    // different views
    private final Set<Policy> hashSet = new HashSet<>();
    private final Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private final Set<Policy> treeSet = new TreeSet<>();

    public boolean addPolicy(Policy p) {
        boolean added = hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
        return added;
    }

    public boolean removePolicy(Policy p) {
        boolean removed = hashSet.remove(p);
        linkedHashSet.remove(p);
        treeSet.remove(p);
        return removed;
    }

    public List<Policy> getAllPoliciesUnique() {
        return new ArrayList<>(hashSet);
    }

    public List<Policy> getPoliciesExpiringWithinDays(int days) {
        LocalDate now = LocalDate.now();
        LocalDate cutoff = now.plusDays(days);
        return hashSet.stream()
            .filter(p -> !p.getExpiryDate().isBefore(now) && !p.getExpiryDate().isAfter(cutoff))
            .sorted()
            .collect(Collectors.toList());
    }

    public List<Policy> getByCoverage(Coverage cov) {
        return hashSet.stream().filter(p -> p.getCoverage() == cov).collect(Collectors.toList());
    }

    public static List<String> findDuplicatePolicyNumbers(List<Policy> policies) {
        Map<String, Integer> counts = new HashMap<>();
        for (Policy p : policies) counts.put(p.getPolicyNumber(), counts.getOrDefault(p.getPolicyNumber(),0)+1);
        return counts.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void comparePerformance(List<Policy> policies) {
        System.out.println("Performance test size: " + policies.size());
        Set<Policy> hs = new HashSet<>();
        Set<Policy> lhs = new LinkedHashSet<>();
        Set<Policy> ts = new TreeSet<>();

        long t;

        t = System.nanoTime();
        for (Policy p : policies) hs.add(p);
        long hsAdd = System.nanoTime() - t;

        t = System.nanoTime();
        for (Policy p : policies) lhs.add(p);
        long lhsAdd = System.nanoTime() - t;

        t = System.nanoTime();
        for (Policy p : policies) ts.add(p);
        long tsAdd = System.nanoTime() - t;

        // contains
        t = System.nanoTime();
        for (Policy p : policies) hs.contains(p);
        long hsContains = System.nanoTime() - t;

        t = System.nanoTime();
        for (Policy p : policies) lhs.contains(p);
        long lhsContains = System.nanoTime() - t;

        t = System.nanoTime();
        for (Policy p : policies) ts.contains(p);
        long tsContains = System.nanoTime() - t;

        System.out.printf("Add (ns): HashSet=%d, LinkedHashSet=%d, TreeSet=%d%n", hsAdd, lhsAdd, tsAdd);
        System.out.printf("Contains (ns): HashSet=%d, LinkedHashSet=%d, TreeSet=%d%n", hsContains, lhsContains, tsContains);
    }

    public static void main(String[] args) {
        PolicyManager mgr = new PolicyManager();
        DateTimeFormatter f = DateTimeFormatter.ISO_LOCAL_DATE;
        mgr.addPolicy(new Policy("P001","Alice", LocalDate.now().plusDays(10), Coverage.HEALTH, 1200));
        mgr.addPolicy(new Policy("P002","Bob",   LocalDate.now().plusDays(40), Coverage.AUTO, 2300));
        mgr.addPolicy(new Policy("P003","Cathy", LocalDate.now().plusDays(5), Coverage.HOME, 1500));
        mgr.addPolicy(new Policy("P004","Dave",  LocalDate.now().plusDays(29), Coverage.HEALTH, 900));

        System.out.println("All unique policies (HashSet):");
        mgr.getAllPoliciesUnique().forEach(System.out::println);

        System.out.println("\nExpiring within 30 days:");
        mgr.getPoliciesExpiringWithinDays(30).forEach(System.out::println);

        System.out.println("\nPolicies with coverage HEALTH:");
        mgr.getByCoverage(Coverage.HEALTH).forEach(System.out::println);

        List<Policy> input = Arrays.asList(
            new Policy("P001","Alice", LocalDate.now().plusDays(10), Coverage.HEALTH, 1200),
            new Policy("P001","Alice dup", LocalDate.now().plusDays(11), Coverage.HEALTH, 1200),
            new Policy("P005","Eve", LocalDate.now().plusDays(100), Coverage.LIFE, 500));
        System.out.println("\nDuplicate policy numbers: " + PolicyManager.findDuplicatePolicyNumbers(input));

        List<Policy> many = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            many.add(new Policy("PX" + i, "H"+i, LocalDate.now().plusDays(i%365), Coverage.AUTO, i*10.0));
        }
        comparePerformance(many);
    }
}

