package com.wp.pre.interview.algorithm.leetcode.solution1;

import com.wp.pre.interview.algorithm.sort.QuickSortDemo;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums,int target){
        int i=0;
        int j=nums.length-1;
        //从小到大快速排序
        QuickSortDemo.quickSort(nums,0,j);
        while (i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                break;
            }
        }
        return new int[]{i,j};
    }
}
