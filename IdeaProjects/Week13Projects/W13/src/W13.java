import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class W13 {

    public static void main(String[] args) throws IOException {
	// This program creates three different geometricObjects, writes info about each object to a file, reads the file and displays the info to the user.
        System.out.println("\nThis program creates three different Geometric Objects, writes their info to a file than reads the file and displays it.\n");

        //Creates and stores three different Geometric objects
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();
        geometricObjects.add(new Circle(156, 1, 1, 10));
        geometricObjects.add(new Square(237, 1, 3, 2));
        geometricObjects.add(new RightTriangle(212,3,3,4,3));

        //Creates a new file and if successful will write the info about the objects to the file
        try (PrintWriter info = new PrintWriter("info.txt")){
            info.println("Shape     ID     Position     Area");
            for(GeometricObject g : geometricObjects){
                info.format("%-9s %-6d (%d,%d) %13.02f%n",g.getObjectType(),g.getIdentifier(),g.getxPoint(),g.getyPoint(),g.getArea());
            }
        }

        //Opens the file and if successfully found reads and displays the info in the file to the user
        File myFile = new File("info.txt");
        try (Scanner input = new Scanner(myFile)){
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
        }

        System.out.println("\nGoodbye...");
    }
}
