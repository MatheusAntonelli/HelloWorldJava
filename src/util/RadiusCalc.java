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

