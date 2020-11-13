package util;

public class IOFCalc {

    public double dollarPrice;
    public double neededDollars;

    public double finalPrice(){
        return neededDollars * dollarPrice;
    }
    static double iof = 6;

    public double IOFPrice(){
        return finalPrice() * iof / 100;
    }

    public double pricePayed(){
        return IOFPrice() + finalPrice();
    }

    public String toString(){
        //You can format and use %.2f to show two decimals in the result
        return "Amount to be paid in reais = R$: " + pricePayed() + " The IOF is 6%";
    }
}
