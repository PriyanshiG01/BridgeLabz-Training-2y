package oops;
import java.util.*;

public class RemoveDuplicate {
    public static <T> List<T> removeDuplicatesPreserveOrder(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        List<T> out = new ArrayList<>();
        for (T item : list) {
            if (seen.add(item)) out.add(item);
        }
        return out;
    }

    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(3,1,2,2,3,4);
        System.out.println(removeDuplicatesPreserveOrder(in)); 
    }
}
