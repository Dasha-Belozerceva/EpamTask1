package com.db.exersize.arrays;

public class No14 {
    public boolean no14(int[] nums) {
        boolean fourth = false;
        boolean ones = false;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                ones = true;
            }
            if (nums[i] == 4) {
                fourth = true;
            }
        }
        return (ones && !fourth) || (!ones && fourth) || (!ones && !fourth);
    }

}
