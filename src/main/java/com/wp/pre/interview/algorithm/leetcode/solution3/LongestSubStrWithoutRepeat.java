package com.wp.pre.interview.algorithm.leetcode.solution3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutRepeat {

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int start = 0;
        Set<Object> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                max = Math.max(max,i-start);
                start = i;
            }
            set.add(c);
        }
        if(set.size()==0){
            max = s.length();
        }
        return max;
    }

    public static void main(String[] args){
        String str = "abcdaaefghia";

        System.out.println(lengthOfLongestSubstring(str));
    }
}
