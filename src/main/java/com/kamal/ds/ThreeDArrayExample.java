package com.kamal.ds;

public class ThreeDArrayExample {

    public static void main(String[] args){

        int[][][] matrix = new int[3][3][3];


        matrix[0][0][0] = 1;
        matrix[0][0][1] = 2;
        matrix[0][0][2] = 3;

        matrix[0][1][0] = 4;
        matrix[0][1][1] = 5;
        matrix[0][1][2] = 6;

        matrix[0][2][0] = 7;
        matrix[0][2][1] = 8;
        matrix[0][2][2] = 9;

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                for(int k=0;k< matrix[i][j].length;k++){

                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
