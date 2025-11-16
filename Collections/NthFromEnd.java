package oops;
import java.util.*;

public class NthFromEnd {
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be > 0");
        Iterator<T> it1 = list.iterator();
        Iterator<T> it2 = list.iterator();

        int advanced = 0;
        while (advanced < n) {
            if (!it2.hasNext()) return null;
            it2.next();
            advanced++;
        }
    
        while (it2.hasNext()) {
            it1.next();
            it2.next();
        }
        return it1.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(nthFromEnd(list, 2)); // D
    }
}
