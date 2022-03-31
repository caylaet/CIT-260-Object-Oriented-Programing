import java.util.Scanner;

public class W03dot1 {

    public static void main(String[] args) {
	// This program will say what today is as well as a future day in the week based on what the user inputs
        System.out.println("""
                Given today's day of the week and some number of days in the future
                this program will tell you the day of the week for the future day.
                Enter today's day of the week (0 for Sunday, 1 for Monday, etc):""");
        Scanner input = new Scanner(System.in);
        int dayOfTheWeek = input.nextInt();
        //Checks to make sure the user entered a number for a day in the week
        if (dayOfTheWeek <= 6 && dayOfTheWeek >= 0){
            System.out.println("Enter the number of days in the future: ");
            int futureDayOfTheWeek = input.nextInt();
            //Checks to see if the user inputted a positive number
            if (futureDayOfTheWeek >= 0){
                int totalDays = dayOfTheWeek + futureDayOfTheWeek;
                int daysInWeek = 7;
                //Calculates amount of weeks in total future days
                int numberOfWeeks = totalDays / daysInWeek;
                //Calculates what day the future day is based on how may weeks are in total days
                int futureDay = totalDays - daysInWeek * numberOfWeeks;
                String futureDayS = null;
                //sets what the future days is based on the number
                switch (futureDay){
                    case 0: futureDayS = "Sunday";
                        break;
                    case 1: futureDayS = "Monday";
                        break;
                    case 2: futureDayS = "Tuesday";
                        break;
                    case 3: futureDayS = "Wednesday";
                        break;
                    case 4: futureDayS = "Thursday";
                        break;
                    case 5: futureDayS = "Friday";
                        break;
                    case 6: futureDayS = "Saturday";
                        break;
                }
                String dayOfTheWeekS = null;
                //sets what day of the week it is based on the number given by user
                switch (dayOfTheWeek){
                    case 0: dayOfTheWeekS = "Sunday";
                        break;
                    case 1: dayOfTheWeekS = "Monday";
                        break;
                    case 2: dayOfTheWeekS = "Tuesday";
                        break;
                    case 3: dayOfTheWeekS = "Wednesday";
                        break;
                    case 4: dayOfTheWeekS = "Thursday";
                        break;
                    case 5: dayOfTheWeekS = "Friday";
                        break;
                    case 6: dayOfTheWeekS = "Saturday";
                        break;
                }
                System.out.println( "Today is " + dayOfTheWeekS + " and the future day is " + futureDayS + ".");
            }
            else {
                System.out.println( futureDayOfTheWeek + " is invalid. You must enter a positive number.");
            }
        }
        else{
            System.out.println( dayOfTheWeek + " is invalid. Day values must be between between 0 and 6, inclusive.");
        }

        System.out.println("Goodbye");

    }
}
