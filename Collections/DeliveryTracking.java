package oops;
import java.util.*;

class Package {
    String id; String status;
    public Package(String id){this.id=id;}
    public String toString(){return id;}
}

public class DeliveryTracking {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Deque<Package> returned = new ArrayDeque<>();

        Package p1 = new Package("PK1");
        if (ids.add(p1.id)) pending.add(p1);

        // process
        Package cur = pending.remove();
        delivered.add(cur);

        // if returned
        returned.push(cur);
    }
}
