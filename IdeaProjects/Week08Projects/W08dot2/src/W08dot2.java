public class W08dot2 {

    public static void main(String[] args) {
	// this program tests the BankAccount class by first using the parameterized constructor than the no-arg constructor
        int testAccountNumber = 123;
        double testBalance = 5;
        double depositTest1 = 10.50;
        double depositTest2 = 3.25;
        double withdrawalTest1 = 1.50;

        //test using parameterized constructor
        System.out.println("\nThis program tests the BankAccount class by ...");
        System.out.println("...Creating account number 123 with an initial balance of $5.00");
        BankAccount bankAccountArgTest = new BankAccount( testAccountNumber, testBalance);
        System.out.printf("...Making a deposit of $%.2f \n", depositTest1);
        bankAccountArgTest.makeDeposit(depositTest1);
        System.out.printf("...Making a deposit of $%.2f \n", depositTest2);
        bankAccountArgTest.makeDeposit(depositTest2);
        System.out.printf("...Making a withdrawal of $%.2f \n", withdrawalTest1);
        bankAccountArgTest.makeWithdrawal(withdrawalTest1);
        System.out.printf( "The balance in account number %d $%.2f \n", bankAccountArgTest.getAccountNumber(), bankAccountArgTest.getBalance());

        //test using no-arg constructor
        System.out.println("\nThis program tests the BankAccount class by ...");
        System.out.println("...Creating account number 123 with an initial balance of $5.00");
        BankAccount bankAccountNoArgTest = new BankAccount();
        bankAccountNoArgTest.setAccountNumber(testAccountNumber);
        bankAccountNoArgTest.setBalance(testBalance);
        System.out.printf("...Making a deposit of $%.2f \n", depositTest1);
        bankAccountNoArgTest.makeDeposit(depositTest1);
        System.out.printf("...Making a deposit of $%.2f \n", depositTest2);
        bankAccountNoArgTest.makeDeposit(depositTest2);
        System.out.printf("...Making a withdrawal of $%.2f \n", withdrawalTest1);
        bankAccountNoArgTest.makeWithdrawal(withdrawalTest1);
        System.out.printf( "The balance in account number %d $%.2f \n", bankAccountArgTest.getAccountNumber(), bankAccountArgTest.getBalance());

        System.out.println("Goodbye...");
    }
}
