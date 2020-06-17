import com.onemrede.algorithms.strings.easy.GroupAnagrams;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void shouldReturnGroupedAnagrams() {
        List<String> words = new ArrayList<String>(Arrays.asList("yo", "act", "flop", "tac", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        Assert.assertTrue(compare(expected, output));
    }

    @Test
    public void allSameWordsWillGroupIntoOne() {
        List<String> words = new ArrayList<String>(Arrays.asList("yo", "yo", "yo", "yo", "yo", "yo", "yo"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yo", "yo", "yo", "yo", "yo", "yo", "yo")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        Assert.assertTrue(compare(expected, output));
    }

    @Test
    public void allAnagramsWillGroupIntoOne() {
        List<String> words = new ArrayList<String>(Arrays.asList("yoyo", "yooy", "oyoy", "oyyo", "yyoo", "ooyy"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yoyo", "yooy", "oyoy", "oyyo", "yyoo", "ooyy")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        Assert.assertTrue(compare(expected, output));
    }

    @Test
    public void allAnagramsAreDifferentGroups() {
        List<String> words = new ArrayList<String>(Arrays.asList("abc", "defg", "jklm", "pqrst", "xyz", "aa"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("aa")));
        expected.add(new ArrayList<String>(Arrays.asList("abc")));
        expected.add(new ArrayList<String>(Arrays.asList("defg")));
        expected.add(new ArrayList<String>(Arrays.asList("jklm")));
        expected.add(new ArrayList<String>(Arrays.asList("pqrst")));
        expected.add(new ArrayList<String>(Arrays.asList("xyz")));

        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        Assert.assertTrue(compare(expected, output));
    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }
}
