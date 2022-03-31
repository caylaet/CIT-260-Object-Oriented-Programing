public class W06dot2 {

    public static void main(String[] args) {
	// This program displays tables of conversions from Celsius to Fahrenheit and Fahrenheit to Celsius
        System.out.println(" ");
        System.out.println("This program displays tables of conversions between Celsius and Fahrenheit");
        System.out.println(" ");
        //Set all my initial variables
        double startCelsius = 40;
        double startFahrenheit = 120;
        int decreaseCelsius = 1;
        int decreaseFahrenheit = 10;
        int numberOfRows = 10;
        int countStart = 1;
        //Begin printing the table
        System.out.println("Celsius        Fahrenheit     |    Fahrenheit     Celsius");
        System.out.println("----------------------------------------------------------");
        //Loop for calculating the celsius and fahrenheit values than displaying them
        for (int count = countStart ;count <= numberOfRows; count++){
            double returnFahrenheit= celsiusToFahrenheit(startCelsius);
            double returnCelsius = fahrenheitToCelsius(startFahrenheit);
            System.out.printf( "%.1f           %5.1f          |    %5.1f           %5.2f\n", startCelsius,returnFahrenheit,startFahrenheit,returnCelsius);
            startCelsius -= decreaseCelsius;
            startFahrenheit -= decreaseFahrenheit;
        }
        System.out.println(" ");
        System.out.println("Goodbye.");

    }

    /**
     *The celsiusToFahrenheit Method
     * @param tempCelsius
     * @return Temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double tempCelsius){
        double fraction = (9.0/5.0);
        int zeroCelsiusInFahrenheit = 32;
        double fahrenheitTemperature = fraction * tempCelsius + zeroCelsiusInFahrenheit;
        return fahrenheitTemperature;
    }

    /**
     * The fahrenheitToCelsius Method
     * @param tempFahrenheit
     * @return Temperature in Celsius
     */
    public static double fahrenheitToCelsius(double tempFahrenheit){
        double fraction = (5.0/9.0);
        int zeroCelsiusInFahrenheit = 32;
        double celsiusTemperature = (tempFahrenheit - zeroCelsiusInFahrenheit) * fraction;
        return celsiusTemperature;

    }
}
