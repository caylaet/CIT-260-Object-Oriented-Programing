/**
 * This class represents a Geometric Object
 * @author caylatribett
 */
public abstract class GeometricObject {
    private int identifier;
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
    }

    /**
     * the GeometricObject parameterized constructor
     * creates an instance of GeometricObject with values passed through the parameters.
     * @param identifier
     */
    protected GeometricObject(int identifier) {
        dateCreated = new java.util.Date();
        objectType = "none";
        this.identifier = identifier;

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
}
