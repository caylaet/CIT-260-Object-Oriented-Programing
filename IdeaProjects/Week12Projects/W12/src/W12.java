import java.util.ArrayList;
import java.util.Scanner;

public class W12 {

    public static void main(String[] args) {
	// This program tests an abstract class and it's children, by creating three different objects, storing them than displaying their areas to the user.
        System.out.println("\nThis program creates three different Geometric Objects, stores them and than prints out their Areas by their identifier.\n");

        //Creates and stores three different Geometric objects
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();
        geometricObjects.add(new Circle(156, 10));
        geometricObjects.add(new Square(237,2));
        geometricObjects.add(new RightTriangle(212,4,3));

        //loops through the objects to display their areas to the user
        System.out.println("Identifier   Area");
        for(GeometricObject g : geometricObjects){
            System.out.printf("%-11d  %.02f sq. inches\n",g.getIdentifier(),g.getArea());
        }

        //Extra giving the option to print out the strings that describe the objects.
        System.out.println("\nWant to see more details about the objects Y or N?");
        //retrieve from the user if they want to see more info
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        while (!answer.equals("Y") && !answer.equals("N")){
            System.out.println("Please enter Y or N");
            answer = input.next();
        }
        //If user does want to see more display the information
        switch (answer){
            case "Y":
                for(GeometricObject g : geometricObjects){
                    System.out.println(g.toString());
                }
                break;
            case "N":
                break;
            //Even though this should never happen this is to make sure that filled ends up with a value. If no value it will stop the program. Having an empty value later on will causes problems and the computer doesn't like the value filled not initiated with a value
            default:
                throw new IllegalStateException("Unexpected value: " + answer);
        }


        System.out.println("\nGoodbye...");
    }
}
