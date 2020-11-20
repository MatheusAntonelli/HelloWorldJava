/*
    This is a simple class that makes a simple sum with two Integers
    In that class I just Recieve the data and show the result
    Check Sum.java on Util Package.
 */
package codes;

import util.Sum;

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
