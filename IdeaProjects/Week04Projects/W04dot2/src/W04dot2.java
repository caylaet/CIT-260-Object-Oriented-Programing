import java.util.Scanner;

public class W04dot2 {

    public static void main(String[] args) {
        // This program takes user input and than out puts a pay stub.
        double stateTax = .09;
        double federalTax = .20;
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your \n" +
                "   gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "   It then displays your pay stub.");
        //Takes in user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name: ");
        String nameFirstLast = input.nextLine();
        System.out.println("Enter the hours you worked this week: ");
        double hoursWorked = input.nextDouble();
        System.out.println("Enter your hourly wage: ");
        double hourlyWage = input.nextDouble();
        //Performs calculations of gross pay, state withholding, federal withholding, and net pay
        double grossPay = hourlyWage * hoursWorked;
        double withheldStateTax = grossPay * stateTax;
        double withheldFederalTax = grossPay * federalTax;
        double netPay = grossPay - withheldFederalTax - withheldStateTax;
        //Displays pay stub to the user
        System.out.println("");//Just something to make the display look nicer
        System.out.printf("Pay Stub for %s\n", nameFirstLast);
        //Checks to see if they have worked any non full hours than displays differently depending on if they did or not
        int intHoursWorked = (int) hoursWorked;
        double halfHours = hoursWorked - intHoursWorked;
        if (halfHours == 0){
            //Displays without decimal if they have worked full hours
            System.out.printf("Hours Worked: %.0f\n",  hoursWorked);
        }else{
            //Displays with decimal if they have any time less than an hour
            System.out.printf("Hours Worked: %.2f\n",  hoursWorked);
        }
        System.out.printf("Hourly Wage: $%.2f\n", hourlyWage);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.printf("State Tax Withheld: $%.2f\n", withheldStateTax);
        System.out.printf("Federal Tax Withheld: $%.2f\n", withheldFederalTax);
        System.out.printf("Net Pay: $%.2f\n", netPay);
        System.out.println("");//Just something to make the display look nicer
        System.out.println("Goodbye");
    }

}
