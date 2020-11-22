/*
This class is an example of a employee list that can Increase a salary with a given percentage.
for more info check: EmployeeList.java
 */
package codes;



import util.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<EmployeeList> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i = 0; i<N; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1)+ ":");
            System.out.print("ID: ");
            int id = sc.nextInt();

            while (hasId(list,id)){
                System.out.print("ID already registered! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: " );
            Double salary = sc.nextDouble();

            EmployeeList emp  = new EmployeeList(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the id employee that will have salary increase: ");
        int searchedId = sc.nextInt();
        EmployeeList emp = list.stream().filter(x-> x.getId() == searchedId).findFirst().orElse(null);

        //Integer pos = position(list,searchedId);]

        if (emp == null){
            System.out.println("This id Doesn't exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }
        System.out.println();
        System.out.println("LIst of employees: ");
        for (EmployeeList e: list){
            System.out.println(e);
        }
        sc.close();

    }
    public static Integer position(List<EmployeeList>list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<EmployeeList> list, int id) {
        EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
