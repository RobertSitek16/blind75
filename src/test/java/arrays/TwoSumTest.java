package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSum() {
        int[] result1 = twoSum.twoSum(new int[]{3, 4, 5, 6}, 7);
        int[] result2 = twoSum.twoSum(new int[]{4, 5, 6}, 10);
        int[] result3 = twoSum.twoSum(new int[]{5, 5}, 10);

        Assertions.assertArrayEquals(new int[]{0, 1}, result1);
        Assertions.assertArrayEquals(new int[]{0, 2}, result2);
        Assertions.assertArrayEquals(new int[]{0, 1}, result3);
    }
}