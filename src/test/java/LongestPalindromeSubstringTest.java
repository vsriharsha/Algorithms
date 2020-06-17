import com.onemrede.algorithms.strings.easy.LongestPalindromeSubstring;
import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeSubstringTest {
    @Test
    public void shouldReturnLongestPalindromicSubstring() {
        Assert.assertEquals("xyzzyx", LongestPalindromeSubstring.longestPalindrome("abaxyzzyxf"));
    }

    @Test
    public void shouldReturnSingleCharWhenAllCharsAreDifferent() {
        Assert.assertEquals("i", LongestPalindromeSubstring.longestPalindrome("abcdefghi"));
    }
}

