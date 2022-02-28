package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public boolean containsDuplicate (int[] nums) {
        Set <Integer> st = new HashSet <Integer> ();
        for (int num:nums) {
            if (!st.add (num)) { // Hashset.add () returns false if value already present in HashSet else true.
                return true;
            }
        }
        return false;
    }

    @Test
    public void testTrue () {
        int [] nums ={1,2,3,1};
        Assert.assertTrue("True",containsDuplicate(nums));
    }

    @Test
    public void testFalse () {
        int [] nums ={1,2,3,4};
        Assert.assertFalse("True",containsDuplicate(nums));
    }

    @Test
    public void True1 () {
        int [] nums ={1,1,1,3,3,4,3,2,4,2};
        Assert.assertTrue("True",containsDuplicate(nums));
    }
}

