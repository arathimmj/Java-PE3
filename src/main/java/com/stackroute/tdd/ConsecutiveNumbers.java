package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numberInput = br.readLine();     //take input

        String[] numberStrArray = numberInput.split(",", 0);        //make into array

        int size = numberStrArray.length;
        int [] arr = new int [size];

//        convert to interger array
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(numberStrArray[i]);
        }

        int i=0;

//        check if consecutive
        if (arr[i+1]==arr[i]+1 && arr[i+2]==arr[i]+2 && arr[i+3]==arr[i]+3 && arr[i+4]==arr[i]+4 && arr[i+5]==arr[i]+5 && arr[i+6]==arr[i]+6)
            System.out.println("Consecutive");
        else
            System.out.println("Not consecutive");

    }

}
