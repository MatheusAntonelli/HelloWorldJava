/*
    This class takes the radius of a circle
     and prints the results of the mathematical operations
     of the RadiusCalc class on util.

 */
package codes;

import util.RadiusCalc;

import java.util.Locale;
import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RadiusCalc one = new RadiusCalc();
        System.out.print("Enter radius: ");

        one.radius = sc.nextDouble();

        System.out.println(one);


        sc.close();
    }
}
