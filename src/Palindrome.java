/**
 * Created by Oksana on 2/10/17.
 */
public class Palindrome {

    public static int isPalindrome(String a) {

        int i = 0;
        int j = a.length()-1;
        if (j <= 0) {
            return 1;
        }

        while (i < j) {
            while (i <= j && !isAlphaNumerical(a.charAt(i))) {
                i++;
            }

            while (j >= i && !isAlphaNumerical(a.charAt(j))) {
                j--;
            }

            if (i > j) {
                return 1;
            }

            if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(a.charAt(j))) {
                return 0;
            }

            i++;
            j--;
        }
        return 1;
    }

    private static boolean isAlphaNumerical(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        //String input = "--b00a99b45";
        //String input = "1a2";
        //String input = ".,";
        Palindrome pal = new Palindrome();
        System.out.println(pal.isPalindrome(input));
    }
}
