package com.stackroute.tdd;

public class ChessBoard {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++){        //for rows

            for (int j = 0; j < 8; j++){        //for columns

                if ((i+j) % 2 == 0){
                    System.out.print("WW|");
                }
                else {
                    System.out.print("BB|");
                }
            }

            System.out.println();       //print on next row
        }
    }
}
