import com.onemrede.algorithms.strings.easy.PalindromeCheck;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckTest {

    @Test
    public void thisStringIsPalindrome() {
        Assert.assertTrue(PalindromeCheck.isPalindrome("malayalam"));
    }

    @Test
    public void thisStringIsNotPalindrome() {
        Assert.assertFalse(PalindromeCheck.isPalindrome("notpalindrome"));
    }

    @Test
    public void thisStringIsPalindromeReverseMethod() {
        Assert.assertTrue(PalindromeCheck.isPalindromeReverseStringMethod("malayalam"));
    }

    @Test
    public void thisStringIsNotPalindromeReverseMethod() {
        Assert.assertFalse(PalindromeCheck.isPalindromeReverseStringMethod("bebe"));
    }
}
