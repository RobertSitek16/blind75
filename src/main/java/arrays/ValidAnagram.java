package arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[128];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        for (char c : t.toCharArray()) {
            charCount[c]--;
            if (charCount[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
