import java.util.Scanner;

public class W04dot1 {

    public static void main(String[] args) {
	//Takes a users input of a hexadecimal digit and out puts the four digit binary number
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        System.out.println("Enter a hexadecimal number: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        //Checks to make sure user only entered one digit
        if (userInput.length() == 1){
            char hexadecimalNumber = userInput.charAt(0);
            System.out.println(hexadecimalNumber);
            String binaryNumber = "0";
            //depending on the digit entered sets the binary number.
            switch (hexadecimalNumber){
                case '0': binaryNumber = "0000";
                    break;
                case '1': binaryNumber = "0001";
                    break;
                case '2': binaryNumber = "0010";
                    break;
                case '3': binaryNumber = "0011";
                    break;
                case '4': binaryNumber = "0100";
                    break;
                case '5': binaryNumber = "0101";
                    break;
                case '6': binaryNumber = "0110";
                    break;
                case '7': binaryNumber = "0111";
                    break;
                case '8': binaryNumber = "1000";
                    break;
                case '9': binaryNumber = "1001";
                    break;
                case 'A': binaryNumber = "1010";
                    break;
                case 'B': binaryNumber = "1011";
                    break;
                case 'C': binaryNumber = "1100";
                    break;
                case 'D': binaryNumber = "1101";
                    break;
                case 'E': binaryNumber = "1110";
                    break;
                case 'F': binaryNumber = "1111";
                    break;
            }
            //If not a hexadecimal digit than out puts a not valid message
            if (binaryNumber == "0"){
                System.out.println( hexadecimalNumber + " is not a valid hexadecimal digit.");
            }
            //Out puts the binary number of the hexadecimal number
            else{
                System.out.println("The binary value is " + binaryNumber);
            }
        }
        else{
            System.out.println("Please enter a single hexadecimal digit");
        }
        System.out.println("Goodbye");

    }
}
