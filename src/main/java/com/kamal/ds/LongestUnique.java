package com.kamal.ds;

import java.util.Arrays;

public class LongestUnique {

    public static void main(String[] args){

    }

    public static int findLongestSubString(String s){

        int[] last = new int[256];
        Arrays.fill(last,-1);

        int best =0,start =0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (last[c] >= start) start = last[c] + 1;
            last[c] = i;
            best = Math.max(best, i - start + 1);
        }
        return best;
    }
}
