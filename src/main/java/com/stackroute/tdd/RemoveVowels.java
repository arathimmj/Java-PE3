package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveVowels {

    public String[] removeVowels(String[] countryArray){

        String[] finalArray = countryArray;
        int i = 0;

        for (String country : countryArray){

            finalArray[i] = country.replaceAll("[aeiou]", "");
            i++;

        }

        return finalArray;

    }

    public static void main(String[] args) throws Exception{

        RemoveVowels removeVowels = new RemoveVowels();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the num");
        int numOfCountries = Integer.parseInt(br.readLine());

        String[] countryArray = new String[numOfCountries];
        String[] finalArray = new String[numOfCountries];

        for (int i = 0; i<numOfCountries; i++)
            countryArray[i] = br.readLine();

        finalArray = removeVowels.removeVowels(countryArray);

        for (String country : finalArray)
            System.out.println(country);
    }
}
