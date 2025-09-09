package com.arrays;

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        //leetcode 1389
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int n = nums.length;
        int[] target = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
                for (int j = size; j > index[i]; j--) {
                    target[i] = target[i - 1]; //Right Shift
                }
            //target[i] = nums[index[i]];
            target[index[i]] = nums[i];
                size++;

        }
        System.out.println(Arrays.toString(target));
    }
}
