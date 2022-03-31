import java.util.Scanner;

public class W03dot2 {

    public static void main(String[] args) {
	// Lets the user know how many days in a month based off of a month and year they enter
        System.out.println("Given a year and a month in that year, this program will tell you the number of days in that month.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        //calculates if the year is a leap year.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int month = input.nextInt();
        String monthS = null;
        int days = 0;
        //Checks to see if the month entered is between 1 and 12. There are not more than 12 months nor are their less than 1.
        if (month <= 12 && month >= 1 ) {
            //Depending on month entered sets the month and number of days in the month.
            switch (month){
                case 1:
                    monthS = "January";
                    days = 31;
                    break;
                // If it is a leap year sets days to 29, if not 28.
                case 2:
                    monthS = "February";
                    if (isLeapYear){
                        days = 29;
                    }
                    else{
                        days = 28;
                    }
                    break;
                case 3:
                    monthS = "March";
                    days = 31;
                    break;
                case 4:
                    monthS = "April";
                    days = 30;
                    break;
                case 5:
                    monthS = "May";
                    days = 31;
                    break;
                case 6:
                    monthS = "June";
                    days = 30;
                    break;
                case 7:
                    monthS = "July";
                    days = 31;
                    break;
                case 8:
                    monthS = "August";
                    days = 31;
                    break;
                case 9:
                    monthS = "September";
                    days = 30;
                    break;
                case 10:
                    monthS = "October";
                    days = 31;
                    break;
                case 11:
                    monthS = "November";
                    days = 30;
                    break;
                case 12:
                    monthS = "December";
                    days = 31;
                    break;
            }
            System.out.println( monthS + " of " + year + " has " + days + " days in it.");
        }
        else {
            System.out.println( month + " is invalid. Month values must be between between 1 and 12, inclusive.");
        }
        System.out.println("Goodbye");


    }
}
