package oops;
import java.util.*;

public class ListRotate {
    public static <T> void rotateLeft(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return;
        k = ((k % n) + n) % n;
        reverseRange(list, 0, k - 1);
        reverseRange(list, k, n - 1);
        reverseRange(list, 0, n - 1);
    }

    private static <T> void reverseRange(List<T> list, int i, int j) {
        while (i < j) {
            T tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            i++; j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotateLeft(list, 2);
        System.out.println(list); 
    }
}
