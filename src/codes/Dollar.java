package codes;

import util.IOFCalc;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IOFCalc firstCustomer = new IOFCalc();

        //You can use an API for get the actual dollar price!
        System.out.print("What is the dollar price?");
        firstCustomer.dollarPrice = sc.nextDouble();

        System.out.print("How many dollar do you want: ");
        firstCustomer.neededDollars = sc.nextDouble();

        System.out.println("Ok, I'll calculate for You");
        System.out.println();

        System.out.println(firstCustomer);
    }
}

