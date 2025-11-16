package oops;
import java.util.*;

public class SymmetricalDifference {
    public static <T> Set<T> symmetricDiff(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        for (T e : b) {
            if (!result.add(e)) result.remove(e); 
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println(symmetricDiff(s1,s2)); 
    }
}

