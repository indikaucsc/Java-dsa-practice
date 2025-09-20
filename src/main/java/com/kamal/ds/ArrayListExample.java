package com.kamal.ds;
import java.util.ArrayList;

public class ArrayListExample {


    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Cherry");

        System.out.println(" Fruits "+ fruits);

        for(String fu : fruits){
           System.out.println(" " + fu);
        }

        // Lambda
        fruits.forEach( f -> System.out.println(" Fruits " + f));

        // insert with index
        fruits.add(1,"Mango");

        // update
        fruits.set(1,"Big Mango");



    }
}
