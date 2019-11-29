package com.db.exersize.arrays;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }

        if (nums.length == 2) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
            return nums;
        }

        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; ++i) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

}
