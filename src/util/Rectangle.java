package util;

public class Rectangle {
    public double width, heigth;

    public double Area(){
        return width * heigth;
    }
    public double Perimeter(){
        return (width * 2) + (heigth * 2);
    }

    public double Diagonal(){
        double diagonalResult;
        diagonalResult = Math.sqrt((Math.pow(width, 2) + (Math.pow(heigth,2))));
        return diagonalResult;
    }
    //You can use %.2f to show just two decimals.
    public String toString(){
        return "AREA = " + Area()
                + " Perimeter: " + Perimeter()
                + " Diagonal: " + Diagonal();
    }
}
