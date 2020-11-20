/*

This would be the object of the PriceAvg class
with the product setters and getters to be read in PriceAvg
 */
package util;

public class ProductAvg {
    private String name;
    private double price;


    public ProductAvg(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
