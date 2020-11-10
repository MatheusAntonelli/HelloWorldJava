package codes;

import entities.EmployeeData;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeData employeeOne = new EmployeeData();
        System.out.print("Name: ");
        employeeOne.employeeName = sc.nextLine();

        System.out.print("Gross Salary: ");
        employeeOne.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employeeOne.tax = sc.nextDouble();

        System.out.println(employeeOne.firstInfo());

        System.out.println("Wich percentage to increase salary: ");
        employeeOne.percentage = sc.nextDouble();

        System.out.println(employeeOne.updatedInfo());

        sc.close();
    }
}
