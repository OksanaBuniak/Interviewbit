import java.util.*;

public class Multiply2 {

    public static String multiply(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int[] result = new int[len1 + len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                result[i + j] += Character.getNumericValue(b.charAt(len2 - j - 1)) * Character.getNumericValue(a.charAt(len1 - i - 1));
            }
        }

        int buff = 0;
        for (int i = 0; i < len1 + len2; i++) {
            result[i] += buff;
            buff = result[i] / 10;
            result[i] %= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = len1 + len2 - 1; i >= 0; i--) {
            if (sb.length() == 0 && result[i] == 0) {
                continue;
            }
            sb.append(result[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String one = "5131848155574784703269632922904933776792735241197982102373370";
        String two = "56675688419586288442134264892419611145485574406534291250836";
        System.out.println(multiply(one, two));
    }
}