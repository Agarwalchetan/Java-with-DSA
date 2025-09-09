package com.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        // Good Pair nums[i] == nums[j] and i < j
        int n = nums.length;
        int a = 0;
        int ans = 0;
//        for(int i = 0 ; i < n ; i++){
//            for(int j = 0 ; j < n ; j++){
//                if(nums[i] == nums[j] && i<j){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        for(int i = 0 ; i < n ; i++){
//
//            if(nums[a] == nums[i]){ //0-1 0-2 0-3 0-4 0-5 1-2 1-3 1-4 1-5
//                count++;
//            }
//        }
        for(int i = 0 ; i < n ; i++){
            ans = CheckPair(nums , a);
            a++;
        }
        System.out.println(ans);



    }

    static int CheckPair(int[] arr , int b){
        int count = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[b] == arr[i]){
                count++;
            }
        }
        return count;
    }
}
