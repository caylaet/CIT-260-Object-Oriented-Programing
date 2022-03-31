/**
 * This class represents an Hourly Employee
 * @author caylatribett
 */
public class Hourly extends Employee{

    private double hourlyWage;
    private double hoursWorked;
    private double fedTax = 0.15;
    private double sateTax = 0.07;

    /**
     * the Hourly constructor
     * creates an instance of Hourly with defaults of 0 for hourlyWage and hoursWorked
     */
    public Hourly(){
        hourlyWage = 0;
        hoursWorked = 0;
    }

    /**
     * the Hourly parameterized constructor
     * creates an instance of Hourly setting the values of name, serialNumber, hourlyWage, and hoursWorked to the values passed
     * @param name
     * @param serialNumber
     * @param hourlyWage
     * @param hoursWorked
     */
    public Hourly(String name, int serialNumber, double hourlyWage, double hoursWorked) {
        super(name,serialNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    /**
     * the getGrossPay method
     * overridden from the Employee class calculates gross pay based upon hourly pay
     * @return Gross Pay
     */
    @Override
    public double getGrossPay(){
        return hourlyWage * hoursWorked;
    }

    /**
     * the getFederalWithholding method
     * overridden from the Employee class calculates the federal withholding
     * @return Federal withholding
     */
    @Override
    public double getFederalWithholding(){
       return this.getGrossPay() * fedTax;
    }

    /**
     * the getSateWithholding method
     * overridden from the Employee class calculates the state withholding
     * @return State withholding
     */
    @Override
    public double getStateWithholding(){
        return  this.getGrossPay() * sateTax;
    }

    /**
     * the getHourlyWage method
     * a getter for hourlyWage of the Hourly Employee object
     * @return hourlyWage
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * the setHourlyWage method
     * a setter for hourlyWage of the Hourly Employee object
     * @param hourlyWage
     */
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * the getHoursWorked method
     * a getter for hoursWorked of the Hourly Employee object
     * @return hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * the setHoursWorked method
     * a setter for hoursWorked of the Hourly Employee object
     * @param hoursWorked
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
