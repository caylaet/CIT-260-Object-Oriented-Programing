import java.util.Scanner;

public class W10 {

    public static void main(String[] args) {
	// This program creates a Triangle object from information given by the user and than prints out the info about the Triangle

        //Tells the user what the program does
        System.out.println("This program gets input for a triangle from the user.\n" +
                "It then creates a Triangle object and displays its description.");
        Scanner input = new Scanner(System.in);

        //asks for and stores users answer to the color of the triangle
        System.out.println("\nEnter the color of the triangle (e.g. 'red'): ");
        String color = input.next();

        //asks for and stores the users answer to if the triangle is filled
        System.out.println("Is the triangle filled (y or n): ");
        String answer = input.next();
        //If user puts anything other than y or n it will prompt the user for new input
        while (!answer.equals("y") && !answer.equals("n")){
            System.out.println("Please enter y or n");
            answer = input.next();
        }

        //sets the boolean variable for if the triangle is filled depending on the answer given by the user
        Boolean filled;
        switch (answer){
            case "y": filled = true;
                break;
            case "n": filled = false;
                break;
            //Even though this should never happen this is to make sure that filled ends up with a value. If no value it will stop the program. Having an empty value later on will causes problems and the computer doesn't like the value filled not initiated with a value
            default:
                throw new IllegalStateException("Unexpected value: " + answer);
        }

        //asks for and stores the three sizes of the size of the triangle
        System.out.println("Enter the non-zero, positive lengths of the three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        //creates an instance of the Triangle object using the data we have stored
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        //prints out the data from the Triangle object we created
        System.out.println("\nTriangle Output:" + triangle.toString());

    }
}
