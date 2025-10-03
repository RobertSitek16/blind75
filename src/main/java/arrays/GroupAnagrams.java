package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String actual : strs) {
            int[] charCount = new int[26];
            for (char c : actual.toCharArray()) {
                charCount[c - 'a']++;
            }
            String charCountAsString = Arrays.toString(charCount);
            map.computeIfAbsent(charCountAsString, k -> new ArrayList<>()).add(actual);
        }
        return new ArrayList<>(map.values());
    }
}
