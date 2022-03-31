/**
 * This class represents an Employee
 * @author caylatribett
 */
public class Employee {

    private String name;
    private int serialNumber;

    /**
     * the Employee constructor
     * creates an instance of  Employee with defaults of none for name and 0 for serialNumber
     */
    public Employee(){
        name = "none";
        serialNumber = 0;
    }

    /**
     * the Employee parameterized constructor
     * creates an instance of Employee setting the values of name and serialNumber to the values passed
     * @param name
     * @param serialNumber
     */
    public Employee(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    /**
     * the getGrossPay method
     * this calculates and returns the gross pay of the given instance of Employee
     * @return 0 as an employee first has to be specified as Hourly or Salaried before calculating
     */
    public double getGrossPay(){
        return 0;
    }

    /**
     * the getFederalWithholding method
     * this calculates and returns the federal withholding of the given instance of Employee
     * @return 0 as an employee first has to be specified as Hourly or Salaried before calculating
     */
    public double getFederalWithholding(){
        return 0;
    }

    /**
     * the getStateWithholding method
     * this calculates and returns the state withholding of the given instance of Employee
     * @return 0 as an employee first has to be specified as Hourly or Salaried before calculating
     */
    public double getStateWithholding(){
        return 0;
    }

    /**
     * the toString method
     * overridden to produce a string with information about the given instance of Employee
     * @return string description of Employee
     */
    @Override
    public String toString( ) {
        double netPay = this.getGrossPay() - this.getFederalWithholding() - this.getStateWithholding();
        return String.format("Employee: %s Serial: %d\nGross Pay: $%,.2f\nFederal Withholding: $%,.2f\nState Withholding: $%,.2f\nNet Pay: $%,.2f\n", this.name, this.serialNumber, this.getGrossPay(), this.getFederalWithholding(), this.getStateWithholding(), netPay);
    }

    /**
     * the getName method
     * a getter for name of the Employee object
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * the setName method
     * a setter for name of the Employee object
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * the getSerialNumber method
     * a getter for serialNumber of the Employee object
     * @return serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * the setSerialNumber method
     * a setter for serialNumber of the Employee object
     * @param serialNumber
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
