package com.kamal.ds;

import java.util.HashMap;
import java.util.Map;

public class MostFrequencyCharacterInString {

    public static void main(String[] args){

        String word= "ASDAAQWERAGHNNBVBAMKIUHBNJIQWEASD";
        char[] wordsArray = word.toCharArray();


        Map<Character,Integer> count = new HashMap<>();
        for(char c : wordsArray){

            count.put(c, count.getOrDefault(c,0) +1);
        }

        int maxCount =0;
        Character result= null;

        for(var entry : count.entrySet()){

            if(entry.getValue() > maxCount){
                maxCount= entry.getValue();
                result= entry.getKey();
            }
        }
        System.out.println( result.toString());
        System.out.println( "Max count "+ maxCount);
    }


}
