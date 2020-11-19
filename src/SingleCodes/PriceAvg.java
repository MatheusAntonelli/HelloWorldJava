package SingleCodes;

import util.ProductAvg;
import util.Products;

import java.util.Scanner;

public class PriceAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many products? ");
        int n = sc.nextInt();

        ProductAvg[] vect = new ProductAvg[n];

        for (int i = 0; i<n; i++){
            sc.nextLine();
            System.out.print("Product name: ");
            String name = sc.nextLine();
            System.out.print("Product Price: ");
            double price = sc.nextDouble();
            vect[i] = new ProductAvg(name,price);
        }
        double sum = 0.0;

        for (int i = 0; i<n; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("Average price = %.2f", avg);
        sc.close();
    }
}
