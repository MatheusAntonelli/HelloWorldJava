package entities;

public class GradesFunction {
    public  String studentName;
    public double testA;
    public double testB;
    public double testC;

    public double finalGrades(){
        return (testA + testB + testC) / 3;
    }
    public double missingGrades(){
        //Minimum score is 60 points
        return 60 - finalGrades();
    }
    public String passed(){
        return "STUDENT NAME: "
                + studentName
                +"\n"
                +"FINAL GRADE: "
                + finalGrades()
                +"\n Pass";
    }
    public String notPassed(){
        return "STUDENT NAME: "
                + studentName
                +"\n"
                +"FINAL GRADE: "
                + finalGrades()
                +" FAILED \n"
                + "MISSING: "
                +missingGrades();
    }
}
