package com.db.exersize.arrays;

public class Post4 {
    public int[] post4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 4){
                index = i;
            }
        }
        int[] newArray = new int[nums.length - index -1];
        int j = 0;
        for (int i = index + 1; i < nums.length; ++i){
            newArray[j] = nums[i];
            ++j;
        }
        return newArray;
    }

}
