public class W05dot2 {

    public static void main(String[] args) {
	// This program displays all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
        System.out.println("This program displays all of the numbers from 100 to 1000 that are divisible by both 5 and 6. ");
        System.out.println(" ");
        // Initialize variable for counting every 10th number starts a new line
        int countNumbers = 0;
        // Loop for displaying all numbers divisible by both 5 and 6
        for (int i = 100; i <= 1000; i++) {
            // Checks if divisible by both 5 and 6
            if ( i % 5 == 0 && i % 6 == 0 ){
                countNumbers++;
                System.out.printf("%-4d", i);
                // checks for the 10th number than starts new line
                if (countNumbers == 10){
                    countNumbers = 0;
                    System.out.print("\n");
                }

            }
        }
        System.out.println(" ");
        System.out.println("Goodbye");
    }
}
