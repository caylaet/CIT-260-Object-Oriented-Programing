public class Main {

    public static void main(String[] args) {
	// This program Program computes the number of hours worked for a set of hourly employees and will sort by most hours if user requests it

        //Tells the user what the program does
        System.out.println("\nThis Program computes the number of hours worked for a set of hourly employees.");

        //Sets up initial arrays and variables
        String [] namesOfWorkers = {"Tara Teamlead","Harry Hacker","Carl Coder", "Paula Programmer","Darrin Debugger"};
        double [][] hoursWorked ={{0.0, 8.0, 8.0, 8.5, 8.0, 9.0, 0.0},{0.0, 9.0, 9.0, 8.5, 8.0, 7.5, 0.0}, {0.0, 8.5, 8.0, 8.6, 8.6, 9.5, 2.0},{0.0, 4.75, 6.0, 6.25, 6.5, 0.0, 0.0},{0.0, 0.0, 0.0, 0.0, 5.25, 5.25, 6.0}};
        double [] totalHoursOfWorkers = new double[5];
        int startIndex = 0;

        //Goes through the hours worked of each employee and sums them up
        for (int i = startIndex; i < hoursWorked.length; i++){
            double totalHours = 0;
            for (int n = startIndex; n < hoursWorked[i].length ;n++){
                totalHours += hoursWorked[i][n];
            }
            totalHoursOfWorkers[i] = totalHours;
        }

        //Displays the total hours of each employee to the user
        System.out.println("\nEmployee Name         Total Hours");
        for(int i = startIndex; i < namesOfWorkers.length; i++){
            System.out.printf("%-20s %7.2f\n",namesOfWorkers[i], totalHoursOfWorkers[i]);
        }

        //Asks user if they want to sort hours
        System.out.println("\nSort by most hours worked type Y or N?");

        //retrieves user input
        java.util.Scanner input = new java.util.Scanner(System.in);
        String answer = input.next();

        //if user answers yes sorts the arrays and than displays them
        if(answer.equals("Y")) {
            extraCredit(totalHoursOfWorkers, namesOfWorkers);
            System.out.println("\nEmployee Name         Total Hours");
            for (int i = startIndex; i < namesOfWorkers.length; i++) {
                System.out.printf("%-20s %7.2f\n", namesOfWorkers[i], totalHoursOfWorkers[i]);
            }
        }

        System.out.println("\nGoodbye");


    }

    /**
     * The extraCredit Method
     * @param sortHigh
     * @param sort
     * Sorts two arrays in descending order
     */
    public static void extraCredit(double[] sortHigh, String[] sort){
        int startIndex = 0;
        int addSub = 1;

        for (int i = startIndex; i < sortHigh.length - addSub; i++) {
            // Sets current max values and corresponding array
            double currentMax = sortHigh[i];
            String correspondingArray = sort[i];
            int currentMixIndex = i;

            //checks to see if current value is max value if not collects needed values to perform a swap
            for (int j = i + addSub; j < sortHigh.length; j++) {
                if (currentMax < sortHigh[j]) {
                    currentMax = sortHigh[j];
                    correspondingArray = sort[j];
                    currentMixIndex = j;
                }
            }
            // Swaps values to set the new max value and value in corresponding array
            if (currentMixIndex != i) {
                sortHigh[currentMixIndex] = sortHigh[i];
                sortHigh[i] = currentMax;
                sort[currentMixIndex] = sort[i];
                sort[i] = correspondingArray;
            }
        }
    }
}
