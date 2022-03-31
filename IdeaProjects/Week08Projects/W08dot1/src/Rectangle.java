/**
 * the Rectangle class
 * This is a class to create a rectangle object with or without parameters
 * Contains variables for width and height as well as setters and getters for them
 * Contains methods getArea() and getPerimeter()
 * @author Cayla Tribett
 */
public class Rectangle {

    private double width;
    private double height;

    /**
     * the Rectangle constructor
     * creates and instance of a rectangle object with parameters
     * @param width
     * @param height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * the Rectangle constructor
     * Creates an instance of an rectangle object without parameters
     */
    public Rectangle(){
        width = 2;
        height =1;
    }

    /**
     * the getWidth method
     * get the width of the rectangle object
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * the setWidth method
     * set the width of the rectangle object
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * the getHeight method
     * get the height of the rectangle object
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * the setHeight method
     * set the height of the rectangle object
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * the getArea method
     * calculates the area of the rectangle object
     * @return area
     */
    public double getArea(){
        return height * width;
    }

    /**
     * the getPerimeter method
     * calculates the perimeter of the rectangle object
     * @return perimeter
     */
    public double getPerimeter(){
        int twice = 2;
        return twice * (height + width);
    }
}
