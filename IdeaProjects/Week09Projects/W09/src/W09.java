import java.util.Scanner;

public class W09 {

    public static void main(String[] args) {
	// This program tests out the MyPoint class using input from the user and getting the distance using three different methods
        System.out.println("This program creates a point at (0,0) and a point at the coordinates \n" +
                "entered by you. It then computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.");

        //creates an instance of the MyPoint class with default (0,0) point
        MyPoint p1 = new MyPoint();

        //Requests and stores user x and y coordinate points
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the x coordinate of a point: ");
        int xCoord = input.nextInt();
        System.out.println("Enter the y coordinate of a point: ");
        int yCoord = input.nextInt();

        //calculates the distance using the MyPoint p1 and the two coordinates given by the user
        System.out.printf("\nUsing method 1, the distance from (%d,%d) to (%d,%d) is %.2f\n",p1.getX(),p1.getY(),xCoord,yCoord,p1.distance(xCoord,yCoord));

        //Creates a new instance of the MyPoint class using the coordinates given by the user
        MyPoint p2 = new MyPoint(xCoord,yCoord);

        //Calculates the distance using the MyPoint p1 and using the MyPoint p2 as a parameter.
        System.out.printf("Using method 2, the distance from (%d,%d) to (%d,%d) is %.2f\n",p1.getX(),p1.getY(),xCoord,yCoord,p1.distance(p2));

        //Calculates the distance using the MyPoint p1 and MyPoint p2 both as parameters in a static method.
        System.out.printf("Using method 3, the distance from (%d,%d) to (%d,%d) is %.2f\n",p1.getX(),p1.getY(),xCoord,yCoord,MyPoint.distance(p1,p2));

        System.out.println("Goodbye...");


    }
}
