package com.stackroute.tdd;

public class TryExcep {

    TryExcep(String argument){

        char ch = argument.charAt(-1);

    }

    public static void main(String[] args) {

        String str = "Hellothere";

        try {

            TryExcep tryExcep = new TryExcep(str);

        }
        catch (Exception e){

            System.out.println(str);

        }
        finally {
            System.out.println("I have been here");
        }

    }

}
