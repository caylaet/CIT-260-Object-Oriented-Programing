/**
 * This class represents a Circle
 * @author caylatribett
 */
public class Circle extends GeometricObject{

    private double radius;

    /**
     * the Circle constructor
     * creates an instance of Circle with a default radius of 1
     */
    public Circle(){
        super.setObjectType("circle");
        radius = 1;

    }

    /**
     * the Circle parameterized constructor
     * creates an instance of Circle with values passed through the parameters
     * @param identifier
     * @param radius
     */
    public Circle(int identifier, double radius){
        super(identifier);
        super.setObjectType("circle");
        this.radius = radius;
    }

    /**
     * the getArea method
     * inherited from the GeometricObject class this calculates the area of a circle
     * @return area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * the toString method
     * inherited from the GeometricObject class this creates a string describing the circle
     * @return string describing the circle
     */
    @Override
    public String toString() {
        return String.format("I am a %s, with a radius of %.2f inches and an identifier of %d",this.getObjectType(),this.getRadius(), this.getIdentifier());
    }

    /**
     * the getRadius method
     * this is a getter for the radius of the Circle object
     * @return radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * the setRadius method
     * this is a setter for the radius of the Circle object
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
