package com.wp.pre.interview.algorithm.sort;

/**
 * 快速排序算法示例
 * 1.选取一个基点
 * 2.以基点作为分界值 大于基点元素放右边 小于基点元素放左边
 * 3.递归步骤2
 */
public class QuickSortDemo {


    public static void quickSort(int[] arr,int left,int right){
        if(left>right){
            return;
        }
        int i=left;
        int j=right;
        int temp = arr[left];

        while(i!=j){
            while(i<j && arr[j]>=temp){//从右到左 直到小于基点
                j--;
            }
            while(i<j && arr[i]<=temp){//从左到右 直到大于基点
                i++;
            }
            if(i<j){
                swap(arr,i,j);//交换 i与j的值
            }
        }
        //交换基点与i的值
        swap(arr,left,i);
        //递归左边
        quickSort(arr,left,i-1);
        //递归右边
        quickSort(arr,j+1,right);
    }

    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args){
        int[] a = new int[]{5,2,3,6,7,9,1,4,8};
        quickSort(a,0,8);
        for (int aa:a){
            System.out.print(aa + " ");
        }
    }
}
