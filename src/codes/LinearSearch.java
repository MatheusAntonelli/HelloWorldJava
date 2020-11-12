package codes;

import java.util.Scanner;

/*
Program: Linear Search Example
Input: NUmber of elements, element's, value to be searched
Output: Position of the number input by user among other number
 */
public class LinearSearch {

    public static void main(String[] args) {
        int counter, num, item, array[];
        //To capture user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        num = sc.nextInt();

        //Creating array to store all numbers
        array = new int[num];
        System.out.print("Enter " + num + " Integers");

        //Loop to store each numbers in array
        for (counter = 0; counter< num; counter++)
            array[counter] = sc.nextInt();

        System.out.println("Enter the search value:");
        item = sc.nextInt();

        for (counter = 0;counter<num; counter++){
            if (array[counter] == item){
                System.out.println(item + " is present at location " + (counter + 1));
                /*
                Item is found so stop the search and to come out of the lop
                use break statement
                 */
                break;
            }
        }
        if (counter == num)
            System.out.println(item + " doesn't exist in array");
    }
}