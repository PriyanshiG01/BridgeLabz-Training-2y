package oops;
import java.util.*;

public class SubsetCheck {
    public static <T> boolean isSubset(Set<T> potentialSub, Set<T> sup) {
        return sup.containsAll(potentialSub);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println(isSubset(s1,s2));
    }
}
