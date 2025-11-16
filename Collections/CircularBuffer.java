package oops;
import java.util.*;

public class CircularBuffer<T> {
    private final Object[] buffer;
    private int head = 0, tail = 0, size = 0, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new Object[capacity];
    }

    public void insert(T x) {
        if (size == capacity) {
            buffer[tail] = x;
            tail = (tail + 1) % capacity;
            head = tail;
        } else {
            buffer[tail] = x;
            tail = (tail + 1) % capacity;
            size++;
        }
    }

    public List<T> snapshot() {
        List<T> out = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            out.add((T) buffer[(head + i) % capacity]);
        }
        return out;
    }

    public static void main(String[] args) {
        CircularBuffer<Integer> buf = new CircularBuffer<>(3);
        buf.insert(1); buf.insert(2); buf.insert(3);
        buf.insert(4); 
        System.out.println(buf.snapshot()); 
    }
}
