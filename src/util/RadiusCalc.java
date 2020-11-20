/*
    Here I receive the radius and use that formula (C = 2 * π * r) to get the circunference.
    Volume Formula: 4 * PI * (R^3) / 3.
 */
package util;

    public class RadiusCalc {
        public double radius;

        public double circumference(){
            return 2 * Math.PI * radius;
        }

        public double volume(){
            return 4 * Math.PI *Math.pow(radius,3) / 3;
        }
        public String toString(){
            return "Radius: "
                    + radius
                    +" Circunference: "
                    + circumference()
                    +" Volume: "
                    +volume();
        }
    }

