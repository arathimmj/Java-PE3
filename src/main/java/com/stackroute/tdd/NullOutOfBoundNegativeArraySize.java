package com.stackroute.tdd;

public class NullOutOfBoundNegativeArraySize {

    public static void main(String[] args) {

        String str = "Hello There";
        String nullString = null;

        try{
            int length = nullString.length();
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

        String[] strArray = str.split(" ", 0);

        try {
            char ch = str.charAt(-1);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        int size = -5;

        try{
            String[] newStrArray = new String[size];
        }
        catch (NegativeArraySizeException e){
            System.out.println(e);
        }

    }

}
