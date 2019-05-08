package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixAddition {

//    add two matrices
    public int[][] addMatrix(int row, int col, int[][] matrix1, int[][] matrix2) {

        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++){

            for (int j = 0; j < col; j++){

                sum[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }

        return sum;

    }

    public static void main(String[] args) throws Exception{

        MatrixAddition matrixAddition = new MatrixAddition();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        get number of rows
        System.out.println("Row:");
        int row = Integer.parseInt(br.readLine());

//        get number of columns
        System.out.println("Column:");
        int col = Integer.parseInt(br.readLine());

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        System.out.println("Matrix 1");

//        get matrix1
        for (int i = 0; i < row; i++){

            for (int j = 0; j<col; j++)

               matrix1[i][j] = Integer.parseInt(br.readLine());
        }

        System.out.println("Matrix 2");

//        get matrix2
        for (int i = 0; i < row; i++){

            for (int j = 0; j<col; j++)

                matrix2[i][j] = Integer.parseInt(br.readLine());
        }

        int[][] sum = new int[row][col];

//        add two matrices
        sum = matrixAddition.addMatrix(row, col, matrix1, matrix2);

//        print results
        for (int i = 0; i < row; i++){

            for (int j = 0; j<col; j++)

                System.out.print(sum[i][j]+"\t");

            System.out.println();
        }

    }

}
