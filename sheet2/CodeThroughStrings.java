package oops2;
public class codeThroughStrings {
    public static String getCode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            sb.append(Math.abs(s.charAt(i + 1) - s.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getCode("AFK")); // 5  (example)
    }
}
