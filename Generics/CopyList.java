package oops;
import java.util.*;

class CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(10, 20);

        copyList(dest, src);
        System.out.println(dest);
    }
}
