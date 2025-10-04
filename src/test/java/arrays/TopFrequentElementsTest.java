package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TopFrequentElementsTest {
    private TopFrequentElements topFrequentElements;

    @BeforeEach
    public void setUp() {
        topFrequentElements = new TopFrequentElements();
    }

    @Test
    public void top2FrequentElements() {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;

        int[] result = topFrequentElements.topKFrequent(nums, k);

        int[] expected = {2, 3};

        Arrays.sort(result);
        Arrays.sort(expected);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void top1FrequentElements() {
        int[] nums = {7, 7};
        int k = 1;

        int[] result = topFrequentElements.topKFrequent(nums, k);

        int[] expected = {7};

        Arrays.sort(result);
        Arrays.sort(expected);

        Assertions.assertArrayEquals(expected, result);
    }
}