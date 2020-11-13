package codes;

import util.RadiusCalc;

import java.util.Locale;
import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        // write your code here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        RadiusCalc one = new RadiusCalc();
        System.out.print("Enter radius: ");
        one.radius = sc.nextDouble();

        System.out.println(one);


        sc.close();
    }
}
