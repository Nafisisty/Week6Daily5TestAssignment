package com.example.week6daily5testassignment;


public class Problem2 {

    public static void main(String[] args) {

        String[][] charArray= new String[3][3];

        charArray[0][0] = "a";
        charArray[0][1] = "b";
        charArray[0][2] = "c";
        charArray[1][0] = "d";
        charArray[1][1] = "e";
        charArray[1][2] = "f";
        charArray[2][0] = "g";
        charArray[2][1] = "a";
        charArray[2][2] = "b";


        System.out.print("{");

        for (int i = 0; i < 3; i++){
            for(int j=0; j < 3; j++) {


                for(int k = i; k < 3; k++) {
                    for (int l = j+1; l < 3; l++) {

                        if (charArray[i][j] == charArray[k][l]){

                            System.out.print("(" + i + ", " + j + "), " + "(" + k + ", " + l + ")");

                        }

                    }
                }
            }
        }

        System.out.print("}");

    }
}
