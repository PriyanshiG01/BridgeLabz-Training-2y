package functional_interface;
import java.util.function.Function;
public class string {

    public static void main(String[] args) {
        int characterLimit = 10;

        Function<String, Integer> stringLength = message -> message.length();

        String msg1 = "Hello";
        String msg2 = "Hello, World!";

        System.out.println("Length of msg1: " + stringLength.apply(msg1));
        System.out.println("Length of msg2: " + stringLength.apply(msg2));

        System.out.println("msg1 exceeds limit? " + (stringLength.apply(msg1) > characterLimit));
        System.out.println("msg2 exceeds limit? " + (stringLength.apply(msg2) > characterLimit));
    }
}
