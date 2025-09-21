package com.kamal.ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {


    public static void main(String[] args){
    List<Integer> list = Arrays.asList(2,2,3,1,2,4,5,67,8,8,2);

    HashSet<Integer> removeDuplicate = new HashSet<>(list);


        System.out.println(" "+ removeDuplicate );
    }
}
