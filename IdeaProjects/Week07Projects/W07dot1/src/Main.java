public class Main {

    public static void main(String[] args) {
	// This program takes a users input of numbers and calculates the mean and standard deviation of those numbers.
        int totalInputNumbers = 5;
        int firstIndexInArray = 0;

        //Tells the user what the program does
        System.out.println("\nThis program computes the mean and the standard deviation for a set of numbers.\n");

        //Requests and stores users input of 5 numbers.
        java.util.Scanner input = new java.util.Scanner(System.in);
        double [] userInputNumbers = new double[totalInputNumbers];
        for (int i = firstIndexInArray; i < userInputNumbers.length; i++) {
            System.out.println("Enter a number: ");
            userInputNumbers[i] = input.nextDouble();
        }

        //Calculates than tells the user what the mean is.
        double mean = mean(userInputNumbers);
        System.out.printf("\nThe mean of this set of numbers is %.2f\n", mean);

        //Calculates than tells the user what the Standard deviation is.
        double deviation = deviation(userInputNumbers);
        System.out.printf("The standard deviation is %.2f\n", deviation);

        System.out.println("\nGoodbye");

    }

    /**
     * The mean Method
     * @param   x
     * @return The mean of the numbers within an Array
     */
    public static double mean(double[ ] x){
        double sum = 0;
        int arrayLength = x.length;
        int firstIndexInArray =0;

        //sums up all the numbers
        for (int i = firstIndexInArray; i < arrayLength; i++ ){
            sum += x[i];
        }
        //Calculates than returns the mean
        return sum / arrayLength;

    }

    /**
     * The deviation Method
     * @param x
     * @return The Standard deviation of a set of numbers within an array
     */
    public static double deviation(double[ ] x){
        double mean = mean(x);
        double sumOfSquares = 0;
        int firstIndexInArray =0;
        int arrayLength = x.length;
        int squared = 2;
        int one = 1;

        //Sums up the squares of the deviation from the mean
        for( int i = firstIndexInArray; i < arrayLength; i++){
            sumOfSquares += Math.pow((x[i] - mean), squared);
        }
        //Calculates and returns the standard deviation
        return  Math.sqrt(sumOfSquares / (arrayLength - one));
    }
}
