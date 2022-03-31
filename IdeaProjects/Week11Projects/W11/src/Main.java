import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// This program creates a list of Employees that are either hourly or salaried than loops through them to print a Payroll report

        System.out.println("\nThis program prints a payroll of employees\n");

        //Creates a new array to hold employees
        ArrayList<Employee> employees = new ArrayList<>();

        //Adds different employees to the array
        employees.add(new Hourly("Harry Hacker", 123, 15,30 ));
        employees.add(new Hourly("Isabel Intern",233,12.50,20));
        employees.add(new Salaried("Cathy Coder", 611,80000));

        //Prints out the payroll report
        System.out.println("Payroll Report");
        //Loops through the list of employees to print out individual reports
        for(Employee e : employees){
            System.out.println(e);
        }

        System.out.println("GoodBye...");


    }
}
