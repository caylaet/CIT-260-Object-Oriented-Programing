public class W05dot1 {

    public static void main(String[] args) {
	// This program displays a table of pounds per kilogram
        System.out.println("This program displays a table of pounds per kilogram.");
        System.out.println(" ");
        // Initialize variable for how many pound in one kilogram
        double poundsPerKilogram = 2.2;
        // Set up display
        System.out.println("Kilograms    Pounds");
        System.out.println("---------    ------");
        // Loop to calculate and display kilograms per pound table.
        for (int kilograms = 1; kilograms < 16; kilograms += 2){
            double pounds = kilograms * poundsPerKilogram;

            // Not exactly like the table for the assignment, shifted pounds display over by one. Liked the look of that better.
            System.out.printf("%2d %14.1f\n", kilograms, pounds);
        }
        System.out.println(" ");
        System.out.println("Goodbye");
    }
}
