package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @BeforeEach
    public void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    public void isAnagramShouldBeTrue() {
        String s = "aba";
        String t = "baa";

        boolean result = validAnagram.isAnagram(s, t);

        Assertions.assertTrue(result);
    }

    @Test
    public void isAnagramShouldBeTrueForEmptyString() {
        String s = "";
        String t = "";

        boolean result = validAnagram.isAnagram(s, t);

        Assertions.assertTrue(result);
    }

    @Test
    public void isAnagramShouldBeFalse() {
        String s = "aab";
        String t = "bba";

        boolean result = validAnagram.isAnagram(s, t);

        Assertions.assertFalse(result);
    }

}