package com.kamal.ds;
import java.util.*;

public class FrequencyCounter {
    public static Map<Integer,Integer> count(int[] nums){
        Map<Integer,Integer> m = new HashMap<>();
        for (int x : nums) m.merge(x, 1, Integer::sum);
        return m;
    }
}
