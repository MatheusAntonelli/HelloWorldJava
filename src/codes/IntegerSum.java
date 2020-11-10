package codes;

import entities.Sum;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Sum firstSum = new Sum();

        Scanner readNumbers = new Scanner(System.in);

        System.out.print("First Number: ");
        firstSum.firstNumber = readNumbers.nextInt();

        System.out.print("First Number: ");
        firstSum.secondNumber = readNumbers.nextInt();

        System.out.println(firstSum.result());
    }
}
