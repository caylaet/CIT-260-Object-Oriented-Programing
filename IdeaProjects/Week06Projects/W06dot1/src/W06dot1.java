import java.util.Scanner;

public class W06dot1 {


    public static void main(String[] args) {
	// Gets an investment and an investment rate from the user and calculates the future value over the course of 10 years.
        System.out.println(" ");
        System.out.println("Given an investment amount and an annual interest rate, this program \n" +
                "will calculate the future value of the investment for a period of\n" +
                "ten years.");

        boolean correctInvestment;
        boolean correctInterestRate;
        double investment;
        double interestRate;
        //Set all my initial variables
        int tableStartYears = 1;
        int tableEndYears = 10;
        double convertToDecimal = 100;
        int monthsInYear = 12;

        Scanner input = new Scanner(System.in);
        //This loop will retrieve the investment from the user if it is a positive non-zero number it will exit other wise it will keep asking user for the correct input
        do{
            System.out.println(" ");
            System.out.println("Enter a positive, non-zero value for the investment: ");
            investment = input.nextDouble();
            if(investment > 0){
                correctInvestment = false;
            }
            else{
                correctInvestment = true;
                System.out.println("Incorrect input. Please try again.");
            }
        }while(correctInvestment);

        //This loop will retrieve the annual interest rate from the user if it is between 0 and 100 it will exit other wise it will keep asking user for the correct input
        do{
            System.out.println(" ");
            System.out.println("Enter an annual interest rate, between 0 and 100: ");
            interestRate = input.nextDouble();
            if(interestRate > 0 && interestRate < 100){
                correctInterestRate = false;
            }
            else{
                correctInterestRate = true;
                System.out.println("Incorrect input. Please try again.");
            }
        }while(correctInterestRate);

        //converts user input to a monthly decimal rate
        interestRate = interestRate/convertToDecimal;
        interestRate = interestRate/monthsInYear;

        //prints out the table of years and future value for the user to see
        System.out.println(" ");
        System.out.println("Years     Future Value");
        //Uses a for loop to calculate and print future value over the years specified it the variables above
        for(int count = tableStartYears; count <= tableEndYears; count++) {
            double futureValue = futureValue(investment,interestRate,count);
            System.out.printf("%2d         $%.2f\n",count,futureValue);
        }
        System.out.println(" ");
        System.out.println("Goodbye...");



    }

    /**
     * The futureValue Method
     * @param investmentAmount
     * @param monthlyInterestRate
     * @param years
     * @return the future value
     */
    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years){
        int oneWhole = 1;
        int monthsInYear = 12;

        double futureValue = investmentAmount * (Math.pow((oneWhole + monthlyInterestRate),(years * monthsInYear)));
        return futureValue;
    }
}
