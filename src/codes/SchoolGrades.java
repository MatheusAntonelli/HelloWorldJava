package codes;

import entities.GradesFunction;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        GradesFunction studentOne = new GradesFunction();

        System.out.println("Welcome to the grades program of X School '_' ");

        System.out.print("Please tell me the name of the student: ");
        studentOne.studentName = read.nextLine();

        System.out.print("Can you digit the first grade: OBS: \n" +
                "Remember maximum score is 100: ");
        studentOne.testA = read.nextDouble();

        System.out.print("Can you digit the second grade: OBS: \n" +
                "Remember maximum score is 100: ");
        studentOne.testB = read.nextDouble();


        System.out.print("Can you digit the third grade: OBS: \n" +
                "Remember maximum score is 100: ");
        studentOne.testC = read.nextDouble();


        if (studentOne.finalGrades()>=60){
            System.out.println(studentOne.passed());
        }else{
            System.out.println(studentOne.notPassed());
        }


    }
}
