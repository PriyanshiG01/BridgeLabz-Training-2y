package priyanshi;
public class Multiple{
    public static boolean isExactMultiple(int N, int M) {
        if (M == 0) {
            throw new IllegalArgumentException("M cannot be zero.");
        }
        return N % M == 0;
    }

    public static void main(String[] args) {
        int N = 20;
        int M = 5;

        if (isExactMultiple(N, M)) {
            System.out.println(N + " is an exact multiple of " + M);
        } else {
            System.out.println(N + " is NOT an exact multiple of " + M);
        }
    }
}

