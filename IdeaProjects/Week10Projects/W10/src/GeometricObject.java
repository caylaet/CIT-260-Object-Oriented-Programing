/**
 * Represents a GeometricObject
 * @author Introdution to Java Programing by Y. Daniel Liang
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * the GeometricObject constructor
     * creates a GeometricObject with default values
     */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * the GeometricObject arguments constructor
     * creates a GeometricObject with parameters specified
     * @param color
     * @param filled
     */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * the getColor method
     * a getter for the color of the GeometricObject
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * the setColor method
     * a setter for the color of the GeometricObject
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * the isFilled method
     * a getter for the GeometricObject to see if it is filled
     * @return filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * the setFilled method
     * a setter to specify if the GeometricObject is filled
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * the getDateCreated method
     * a getter for the date of when the instance of the GeometricObject was created
     * @return dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * the toString method
     * creates a string of the info for the specific instance of the GeometricObject
     * @return a string of the data collected for the GeometricObject
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
