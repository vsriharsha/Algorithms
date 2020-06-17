import com.onemrede.algorithms.arrays.easy.ValidateSubsequence;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequenceTest {

    @Test
    public void sameValuesButShortWillPass() {
        List<Integer> array = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> sequence = Arrays.asList(1, 1, 1, 1);
        Assert.assertTrue(ValidateSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void sameValuesButMoreWillFail() {
        List<Integer> array = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> sequence = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1);

        Assert.assertFalse(ValidateSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void invalidSubsequenceValuesReturnsFalse() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -2);

        Assert.assertFalse(ValidateSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void validSubsequenceWillReturnTrue() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

        Assert.assertTrue(ValidateSubsequence.isValidSubsequence(array, sequence));
    }
}
