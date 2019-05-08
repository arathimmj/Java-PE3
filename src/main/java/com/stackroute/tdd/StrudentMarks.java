package com.stackroute.tdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StrudentMarks {

//    check if student marks are valid
    public boolean checkStudentMark(int numOfStudents, int[] stuGrades){

        for (int grade : stuGrades){
            if (grade >= 0 && grade <= 100)
                continue;
            else
                return false;
        }

        return true;

    }

    public static void main(String[] args) throws Exception{

        StrudentMarks strudentMarks = new StrudentMarks();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the num");
        int numOfStudents = Integer.parseInt(br.readLine());

        int[] stuGrades = new int[numOfStudents];

        for (int i = 0; i<numOfStudents; i++)
            stuGrades[i] = Integer.parseInt(br.readLine());

        if (!strudentMarks.checkStudentMark(numOfStudents,stuGrades))
            System.out.println("Error");

    }

}
