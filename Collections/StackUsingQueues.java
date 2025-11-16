package oops;
import java.util.*;

public class StackUsingQueues<T> {
    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();

    public void push(T x) {
        q2.add(x);
        while (!q1.isEmpty()) q2.add(q1.remove());
      
        Queue<T> tmp = q1; q1 = q2; q2 = tmp;
    }

    public T pop() {
        if (q1.isEmpty()) return null;
        return q1.remove();
    }

    public T top() {
        return q1.peek();
    }

    public boolean isEmpty() { return q1.isEmpty(); }

    public static void main(String[] args) {
        StackUsingQueues<Integer> s = new StackUsingQueues<>();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());
        System.out.println(s.top()); 
    }
}
