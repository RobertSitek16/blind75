package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams;

    @BeforeEach
    public void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void shouldGroupAnagrams() {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        List<String> group1 = List.of("hat");
        List<String> group2 = List.of("act", "cat");
        List<String> group3 = List.of("stop", "pots", "tops");

        Assertions.assertTrue(result.contains(group1));
        Assertions.assertTrue(result.stream().anyMatch(group -> group.containsAll(group2)));
        Assertions.assertTrue(result.stream().anyMatch(group -> group.containsAll(group3)));
    }

    @Test
    public void shouldGroupAnagramsWithOneElement() {
        String[] strs = {""};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        Assertions.assertIterableEquals(List.of(List.of("")), result);
    }

    @Test
    public void shouldGroupEmptyInput() {
        String[] strs = {};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        Assertions.assertEquals(0, result.size());
        Assertions.assertIterableEquals(List.of(), result);
    }

    @Test
    public void shouldGroupAnagramsWithTwoDuplicates() {
        String[] strs = {"bbb", "bbb"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        Assertions.assertEquals(List.of(List.of("bbb", "bbb")), result);
    }

}