package codes;

import entities.TriangleMath;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleMath x = new TriangleMath();

        System.out.println("Enter the measures of Triangle");
        System.out.print("First: ");
        x.A = sc.nextDouble();

        System.out.print("Second:");
        x.B = sc.nextDouble();

        System.out.print("Thrid: ");
        x.C = sc.nextDouble();

        System.out.printf("Third: %.2f" , x.area());
    }
}
