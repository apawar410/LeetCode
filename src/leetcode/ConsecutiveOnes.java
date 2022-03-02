package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i : nums) {
            if (i == 1) {
                count += 1;
            } else {
                count = 0;
            }
            max = Math.max (count,max);
        }
    return max;
    }

    @Test
    public void test1() {

        int  [] nums = {1, 1, 0, 1, 1, 1};
        Assert.assertEquals(3, findMaxConsecutiveOnes(nums));
    }
}

