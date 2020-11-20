/*
    That class returns me the area of a triangle
     for the class Triangle on Codes..

 */
package util;

public class TriangleMath {
    public double A,B,C;

    public double area(){
        double p = (A + B + C ) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
