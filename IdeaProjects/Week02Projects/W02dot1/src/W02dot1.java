import java.util.Scanner;

public class W02dot1 {

    public static void main(String[] args) {
	// This takes input of celsius temperature from the user converts it to Fahrenheit and outputs the result
        System.out.println("This program converts a temperature in degrees Celsius into a " +
                "temperature in degrees Fahrenheit. Enter a temperature in degrees Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsiusTemperature;
        celsiusTemperature = input.nextDouble();
        double fahrenheitTemperature = (9.0/5.0)* celsiusTemperature + 32;
        System.out.format("%5.2f degrees Celsius is equal to %5.2f degrees Fahrenheit.%n", celsiusTemperature, fahrenheitTemperature );
        System.out.println("Goodbye");

    }
}
