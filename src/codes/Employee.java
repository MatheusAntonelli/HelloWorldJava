package codes;

import util.EmployeeData;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeData func1 = new EmployeeData();

        System.out.print("Name: ");
        func1.employeeName = sc.nextLine();
        System.out.print("Gross Salary: ");
        func1.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func1.tax = sc.nextDouble();


        System.out.println(func1.firstInfo());

        System.out.print("Wich percentage to increase salary: ");
        func1.percentage = sc.nextDouble();

        System.out.println(func1.updatedInfo());



    }
}
