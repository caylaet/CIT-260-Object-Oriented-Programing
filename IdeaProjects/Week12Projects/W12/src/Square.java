/**
 * This class represents a Square
 * @author caylatribett
 */
public class Square extends GeometricObject{

    private double side;

    /**
     * the Square constructor
     * creates an instance of Square with a default of 0 for the side
     */
    public Square(){
        super.setObjectType("square");
        side = 0;
    }

    /**
     * the Square parameterized constructor
     * creates an instance of the Square with values from the parameters
     * @param identifier
     * @param side
     */
    public Square(int identifier, double side) {
        super(identifier);
        super.setObjectType("square");
        this.side = side;
    }

    /**
     * the getArea method
     * inherited from the GeometricObject class calculates the area of the square
     * @return area of the square
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * the toString method
     * inherited from the GeometricObject class this creates a string describing the square
     * @return string describing the square
     */
    @Override
    public String toString() {
        return String.format("I am a %s, with a side of %.2f inches and an identifier of %d", this.getObjectType(), this.getSide(),this.getIdentifier());
    }

    /**
     * the getSide method
     * this is a getter for the side of the Square object
     * @return side of the square
     */
    public double getSide() {
        return side;
    }

    /**
     * the setSide method
     * this is a setter for the side of the Square object
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }
}
