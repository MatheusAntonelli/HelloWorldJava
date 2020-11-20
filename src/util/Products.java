package util;
/*
Here are the getters and setters of Stock.Java.
 */

public class Products {
    private String name;
    private double price;
    private int quantity;




    public Products(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Products(String name,double price){
        this.name = name;
        this.price = price;
        
    }

    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;

    }
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    //If you use the toString method you can just call the product name in a Print and receive that information!
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                +" units, Total: $ "
                +String.format("%.2f",totalValueInStock());
    }
}
