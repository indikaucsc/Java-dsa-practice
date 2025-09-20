package com.kamal.ds;

public class ArrayExample {

    public static void main(String[] args){

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] =2;
        numbers[2] =3;
        numbers[3] =4;
        numbers[4]=5;

        System.out.println(numbers[3]);


        // update
        numbers[3] = 24;

        System.out.println("After update :" +numbers[3]);

        System.out.println("Length : "+ numbers.length);


        // Loop / Iterate
        for(int a : numbers){
            System.out.println("Array Items :"+ a);
        }



    }
}
