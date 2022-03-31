/**
 * This class represents a Right Triangle
 * @author caylatribett
 */
public class RightTriangle extends GeometricObject{

    private double base;
    private double height;
    private double half = .5;

    /**
     * the RightTriangle constructor
     * creates an instance of RightTriangle with default base of 0 and height of 0
     */
    public RightTriangle(){
        super.setObjectType("right triangle");
        base = 0;
        height = 0;
    }

    /**
     * the RightTriangle parameterized constructor
     * creates an instance of RightTriangle with values from the parameters
     * @param identifier
     * @param base
     * @param height
     */
    public RightTriangle(int identifier, double base, double height) {
        super(identifier);
        super.setObjectType("right triangle");
        this.base = base;
        this.height = height;
    }

    /**
     * the getArea method
     * inherited from the GeometricObject class calculates the area of the RightTriangle
     * @return area of the RightTriangle
     */
    @Override
    public double getArea() {
        return half * (base * height);
    }

    /**
     * the toString method
     * inherited from the GeometricObject class this creates a string describing the RightTriangle
     * @return string describing the RightTriangle
     */
    @Override
    public String toString() {
        return String.format("I am a %s, with a base of %.2f inches, a height of %.2f inches, and an identifier of %d", this.getObjectType(), this.getBase(),this.getHeight(), this.getIdentifier());
    }

    /**
     * the getBase method
     * this is a getter for the base of the RightTriangle object
     * @return base of the triangle
     */
    public double getBase() {
        return base;
    }

    /**
     * the setBase method
     * this is a setter for the base of the RightTriangle object
     * @param base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * the getHeight method
     * this is a getter for the height of the RightTriangle object
     * @return height of the triangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * the setHeight method
     * this is a setter for the height of the RightTriangle object
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
