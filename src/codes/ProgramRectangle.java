package codes;

import entities.Rectangle;

import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle x = new Rectangle();
        System.out.println("Enter width and HEigth of the rectangle: ");
        System.out.print("Width: ");
        x.width = sc.nextDouble();

        System.out.print("Heigth: ");
        x.heigth = sc.nextDouble();
        sc.close();

        System.out.println(x);
    }




}
