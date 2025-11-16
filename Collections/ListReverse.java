package oops;
import java.util.*;

public class ListReverse {
   
    public static <T> void reverse(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            i++; j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        reverse(a);
        reverse(l);

        System.out.println("ArrayList reversed: " + a);  
        System.out.println("LinkedList reversed: " + l); 
    }
}
