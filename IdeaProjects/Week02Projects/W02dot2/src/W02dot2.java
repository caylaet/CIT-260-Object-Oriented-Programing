import java.util.Scanner;

public class W02dot2 {

    public static void main(String[] args) {
	// This gets the input of both the cost of the meal and percentage of tip, calculates than outputs the tip, tax and total meal cost
        System.out.println("Given the price of a meal and a percentage to use for the tip, this program calculates the tip, the tax, and the total amount of the bill.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost of the meal: ");
        double costOfMeal;
        costOfMeal = input.nextDouble();
        System.out.println("Enter the tip percentage: ");
        double tipPercentage;
        tipPercentage =input.nextDouble();
        double tax = 3.2 / 100;
        double tip = costOfMeal * (tipPercentage / 100);
        double taxOfMeal = costOfMeal * tax;
        double totalCostOfMeal = costOfMeal + tip + taxOfMeal;
        System.out.format("The tip is $%4.2f.%n", tip);
        System.out.format("The tax is $%4.2f.%n", taxOfMeal);
        System.out.format("The total bill is $%5.2f.%n", totalCostOfMeal);
        System.out.println("Goodbye");
    }
}
