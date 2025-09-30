package arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num: nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

}
