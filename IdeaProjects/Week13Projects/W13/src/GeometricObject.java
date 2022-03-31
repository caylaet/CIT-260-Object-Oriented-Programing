/**
 * This class represents a Geometric Object
 * @author caylatribett
 */
public abstract class GeometricObject {
    private int identifier;
    private int xPoint;
    private int yPoint;
    private String objectType;
    private java.util.Date dateCreated;

    /**
     * the GeometricObject constructor
     * creates an instance GeometricObject with default values of "none" for objectType and 0 for identifier
     */
    protected GeometricObject(){
        dateCreated = new java.util.Date();
        objectType = "none";
        identifier = 0;
        xPoint = 0;
        yPoint = 0;
    }

    /**
     * the GeometricObject parameterized constructor
     * creates an instance of GeometricObject with values passed through the parameters.
     * @param identifier
     */
    protected GeometricObject(int identifier, int xPoint, int yPoint) {
        dateCreated = new java.util.Date();
        objectType = "none";
        this.identifier = identifier;
        this.yPoint = yPoint;
        this.xPoint = xPoint;

    }

    /**
     * the getIdentifier method
     * this is a getter for the identifier of the GeometricObject object
     * @return identifier of the object
     */
    public int getIdentifier() {
        return identifier;
    }

    /**
     * the setIdentifier method
     * this is a setter for the identifier of the GeometricObject object
     * @param identifier
     */
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    /**
     * the getObjectType method
     * this is a getter for the type of object of the GeometricObject object
     * @return objectType of the object
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * the setObjectType method
     * this is a setter for the type of object of the GeometricObject object
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * the getArea abstract method
     * this is to be implemented by all derived classes
     * @return the area of the object
     */
    public abstract double getArea();

    /**
     * the toString abstract method
     * this is to be implemented by all derived classes
     * @return a string describing the object
     */
    public abstract String toString();

    /**
     * the getxPoint method
     * this is a getter for the x-axis Point of the GeometricObject object
     * @return x-axis Point
     */
    public int getxPoint() {
        return xPoint;
    }

    /**
     * the setObjectType method
     * this is a setter for the x-axis Point of the GeometricObject object
     * @param xPoint
     */
    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    /**
     * the getyPoint method
     * this is a getter for the y-axis Point of the GeometricObject object
     * @return y-axis Point
     */
    public int getyPoint() {
        return yPoint;
    }

    /**
     * the setObjectType method
     * this is a setter for the y-axis Point of the GeometricObject object
     * @param yPoint
     */
    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }
}
