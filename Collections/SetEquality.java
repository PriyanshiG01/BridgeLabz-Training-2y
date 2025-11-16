package oops;
import java.util.*;

public class SetEquality {
    public static <T> boolean equalsSet(Set<T> a, Set<T> b) {
        return a.size() == b.size() && a.containsAll(b); 
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(equalsSet(s1,s2)); 
    }
}
