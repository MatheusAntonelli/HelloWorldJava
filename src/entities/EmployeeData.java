package entities;

public class EmployeeData {
    public String employeeName;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return grossSalary - tax;
    }
    public double increaseSalary(){
        return grossSalary * this.percentage / 100;
    }
    public double finalSalary(){
        return netSalary() + increaseSalary();
    }
    public String firstInfo(){
        return "Name: "
                +employeeName
                +" Gross Salary; $ "
                +String.format("%.2F",grossSalary)
                +" Tax: "
                +tax
                +" Salary: "
                +String.format("%.2f", netSalary());
    }
    public String updatedInfo(){
        return "Updated Info: "
                + employeeName
                + " , $ "
                + String.format("%.2f", finalSalary());
    }
}
