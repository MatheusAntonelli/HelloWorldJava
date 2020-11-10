package entities;

//This is a class for IntegerSum in src/codes

public class Sum {
    public int firstNumber;
    public int secondNumber;

    public int SumResult(){
       return firstNumber + secondNumber;
    }

    public String result(){
        return "THE RESULT IS: " + SumResult();
    }
}
