package com.kamal.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequencyElementFind {


    public static void main(String[] args){

        List<Integer> numberList = Arrays.asList(1,1,2,2,2,3,4,4,4,4);
        Map<Integer,Integer> countNumber = new HashMap<>();

        for(Integer num : numberList){
            countNumber.put(num , countNumber.getOrDefault(num , 0) +1);
        }

        int maxCount = 0;
        int result = -1;

        for ( var entry : countNumber.entrySet()){

            if(entry.getValue() > maxCount){
                maxCount =entry.getValue();
                result = entry.getKey();
            }

        }

        System.out.println( " "+ result);
    }



}
