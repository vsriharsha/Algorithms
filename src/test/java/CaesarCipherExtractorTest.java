import com.onemrede.algorithms.strings.easy.CaesarCipherExtractor;
import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherExtractorTest {
    @Test
    public void shouldReturnSameStringForKeyZero() {
        String str = "abc";
        int key = 0;
        Assert.assertEquals(CaesarCipherExtractor.caesarCipherExtractor(str, key), "abc");
    }
}
