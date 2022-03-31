/**
 * MyPoint class
 * this represents a point
 * @author Cayla Tribett
 */
public class MyPoint {

    //x coordinate of the point
    private int x;
    //y coordinate of the point
    private int y;

    /**
     * the MyPoint constructor
     * a constructor for the MyPoint class without parameters
     */
    public MyPoint(){
        x = 0;
        y = 0;
    }

    /**
     * the MyPoint constructor
     * a constructor for the MyPoint class with parameters
     * @param x
     * @param y
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * the getX method
     * gets the value of x in the MyPoint class
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * the setX method
     * sets the value of x in the MyPoint class
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * the getY method
     * gets the value of y in the Mypoint class
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * the setY method
     * sets the value of Y in the Mypoint class
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * the distance method
     * this method takes two points as parameters
     * and uses them to calculate the
     * distance between them and the
     * current instance of the MyPoint class
     * @param xCoord
     * @param yCoord
     * @return the distance between two points
     */
    public double distance(int xCoord, int yCoord){
        return Math.sqrt((Math.pow((x-xCoord),2) + Math.pow((y-yCoord),2)));
    }

    /**
     * the distance method
     * this method calculates the distance between
     * the current instance of the MyPoint class
     * and another instance of a MyPoint class
     * given as a parameter.
     * @param p
     * @return distance between two points
     */
    public double distance(MyPoint p){
        int x2 = p.getX();
        int y2 = p.getY();
        return Math.sqrt((Math.pow((x-x2),2) + Math.pow((y-y2),2)));
    }

    /**
     * the distance method
     * this method calculates the distance between
     * two points from the two given instances of
     * the MyPoint class as parameters.
     * @param mp1
     * @param mp2
     * @return the distance between two points
     */
    public static double distance (MyPoint mp1, MyPoint mp2){
        int x1 = mp1.getX();
        int y1 = mp1.getY();
        int x2 = mp2.getX();
        int y2 = mp2.getY();
        return Math.sqrt((Math.pow((x1-x2),2) + Math.pow((y1-y2),2)));
    }

}
