package oops;
import java.util.*;

public class QueueReverse {
    public static <T> void reverse(Queue<T> q) {
        if (q.isEmpty()) return;
        T x = q.remove();
        reverse(q);
        q.add(x);
    }

    public static <T> void reverseIterative(Queue<T> q) {
        int n = q.size();
        if (n <= 1) return;
        List<T> temp = new ArrayList<>();
        while(!q.isEmpty()) temp.add(q.remove());
        for (int i = temp.size()-1; i >= 0; i--) q.add(temp.get(i));
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        reverse(q);
        System.out.println(q); 
    }
}
