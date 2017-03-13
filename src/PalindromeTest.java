import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void test1() {
        assertEquals(Palindrome.isPalindrome("A man, a plan, a canal: Panama"), 1);
        assertEquals(Palindrome.isPalindrome("--b00a99b45"), 0);
        assertEquals(Palindrome.isPalindrome("1a2"), 0);
        assertEquals(Palindrome.isPalindrome(",."), 1);
    }
}