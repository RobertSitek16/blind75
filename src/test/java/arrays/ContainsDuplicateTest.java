package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    public void containsDuplicateReturnsTrue() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.hasDuplicate(new int[]{1, 2, 3, 1});
        Assertions.assertTrue(result);
    }

    @Test
    public void containsDuplicateReturnsFalse() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result = containsDuplicate.hasDuplicate(new int[]{23, 12, 0, 2});
        Assertions.assertFalse(result);
    }
}