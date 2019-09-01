package com.wp.pre.interview.algorithm.leetcode.solution5;

/**
 * 最大回文子串
 * 普通算法  依次轮训字符 从左右两侧拓展 直到左右字符不相等
 */
public class LongestPalindrome1 {

    private static int begin = 0;

    private static int len = 0;

    public static String longestPalindrome(String s) {
        if(s==null || s.length()<2){
            return s;
        }
        char[] chs = s.toCharArray();
        for (int i=0; i<chs.length; i++){
            expand(chs,i,i);//奇回文
            expand(chs,i,i+1);
        }
        return s.substring(begin,begin+len);
    }

    public static void expand(char[] chs,int l,int r){
        while(l >=0 && r<chs.length && chs[l] == chs[r]){
            l--;
            r++;
        }
        if(r-l-1>len){
            len = r-l-1;
            begin = l+1;
        }
    }

    public static void main(String[] args){
        String str1 = "abcdefedbca";
        String str2 = "aabbccddccbbaaa";
        System.out.println(longestPalindrome(str2));
    }
}
