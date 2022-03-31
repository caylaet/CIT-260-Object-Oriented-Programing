/**
 * Represents a Triangle Object
 * @author caylaTribett
 */
public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    /**
     * the Triangle Constructor
     * creates and instance of the Triangle object with 1 as the default for the sides
     */
    public Triangle(){
        side1 =1;
        side2 =1;
        side3 =1;
    }

    /**
     * the parameterized Triangle constructor
     * creates an instance of the Triangle object with the given parameters.
     * @param side1
     * @param side2
     * @param side3
     * @param color
     * @param filled
     */
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * the getArea method
     * using the three sides of the Triangle Object calculates the area of that Triangle
     * @return area of the Triangle object
     */
    public double getArea(){
        int half = 2;
        double s = (side1 + side2+ side3) / half;
        return Math.sqrt((s * (s-side1) * (s-side2) * (s-side3)));
    }

    /**
     * the toString method
     * creates a string of the info for the Triangle object
     * @return a string of the data collected for the Triangle Object
     */
    public String toString() {
        return String.format("\nside1 = %.1f, side2 = %.1f, side3 = %.1f\n", side1, side2, side3) + super.toString() + String.format("\nArea = %.2f\n", this.getArea());
    }

    /**
     * the getSide1 method
     * a getter for side1 of the Triangle object
     * @return side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * the setSide1 method
     * a setter for side1 of the Triangle object
     * @param side1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * the getSide2 method
     * a getter for side2 of the Triangle object
     * @return side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * the setSide1 method
     * a setter for side1 of the Triangle object
     * @param side2
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * the getSide3 method
     * a getter for side3 of the Triangle object
     * @return side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * the setSide1 method
     * a setter for side1 of the Triangle object
     * @param side3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
