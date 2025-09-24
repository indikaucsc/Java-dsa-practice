package com.kamal.ds;

public class Anagrams {


    public static void main(String[] args) {
       boolean check = checkAnagrams("abc1" , "bc1a");
       System.out.println(check);
    }

    public static boolean checkAnagrams(String s, String t) {

        int[] count = new int[128];

        for(char c : s.toCharArray()){
           if(Character.isLetterOrDigit(c)){
              count[Character.toLowerCase(c)]++;
           }
        }
        for(char c : t.toCharArray()){
           if(Character.isLetterOrDigit(c)){
              count[Character.toLowerCase(c)]--;
           }
        }
        for(int x : count){
           if(x != 0){
               return false;
           }
        }
        return true;
    }
}
