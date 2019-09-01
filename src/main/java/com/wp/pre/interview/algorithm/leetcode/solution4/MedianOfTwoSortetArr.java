package com.wp.pre.interview.algorithm.leetcode.solution4;

import java.util.Arrays;

/**
 * 两个有序数组 的中间数
 *
 * 转换为 取两个数组中的key大数
 *
 * 保证 数组一长度 不大于数组二长度
 */
public class MedianOfTwoSortetArr {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        if(total%2!=0){
            return findKth(nums1,nums1.length,nums2,nums2.length,total/2+1);
        }else{
            int a = findKth(nums1,nums1.length,nums2,nums2.length,total/2);
            int b = findKth(nums1,nums1.length,nums2,nums2.length,total/2+1);
            return ((double)a+(double)b)/2;
        }
    }

    public static int findKth(int[] a,int m,int[] b,int n,int k){
        if(n>m){
           return findKth(b,n,a,m,k);
        }

        if(m==0){
            return b[k-1];
        }

        if(k==1){
            return Math.min(a[0],b[0]);
        }

        int pa = Math.min(k/2,m);
        int pb = k - pa;

        if(a[pa-1] < b[pb-1]){
            return findKth(Arrays.copyOfRange(a,pa,m),m-pa,b,n,k-pa);
        }else if(a[pa-1] > b[pb-1]){
            return findKth(a,m,Arrays.copyOfRange(b,pb,n),n-pb,k-pb);
        }else{
            return a[pa-1];
        }
    }


    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,3,4,5,6,7,8};
        int[] nums2 = new int[]{3,4,5,6};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
