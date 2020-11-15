package SingleCodes;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter an Integer number:");

        //The input provided by user is stored in num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        /*
        If number is Divisible by 2 then it's an even(NumerdoorCount++;o Par),
        se não é um numero impar
         */
        if (num % 2 == 0){
            System.out.println("Entered number is even");
        }else{
            System.out.println("Entered number is odd");
        }
    }
}
