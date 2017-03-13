
public class ReverseWords {

    public static String reverseWords(String a) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word;
        int i = a.length() - 1;

        while (!Character.isAlphabetic(a.charAt(i))) {
            i--;
        }

        while (i >= 0) {

            word = new StringBuilder();
            while ((i >= 0) && Character.isAlphabetic(a.charAt(i))) {
                word.append(a.charAt(i));
                i--;
            }
            sb.append(word.reverse());

            while ((i >= 0) && !Character.isAlphabetic(a.charAt(i))) {
                i--;
            }

            if (i >= 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String one = "  The   sky   is Blue   ";
        System.out.println(reverseWords(one));
    }
}
