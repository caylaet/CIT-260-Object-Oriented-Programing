/**
 * This class represents an Salaried Employee
 * @author caylatribett
 */
public class Salaried extends Employee{

    private double annualSalary;
    private double fedTax = 0.15;
    private double sateTax = 0.07;
    private int weeksInYear = 52;

    /**
     * the Salaried constructor
     * creates an instance of Salaried with defaults of 0 for annualSalary
     */
    public Salaried(){
        annualSalary = 0;
    }

    /**
     * the Salaried parameterized constructor
     * creates an instance of Salaried setting the values of name, serialNumber, and annualSalary to the values pas
     * @param name
     * @param serialNumber
     * @param annualSalary
     */
    public Salaried(String name, int serialNumber, double annualSalary) {
        super(name, serialNumber);
        this.annualSalary = annualSalary;
    }

    /**
     * the getGrossPay method
     * overridden from the Employee class calculates gross pay based upon salaried pay
     * @return Gross Pay
     */
    @Override
    public double getGrossPay(){
        return annualSalary / weeksInYear;
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
     * the getAnnualSalary method
     * a getter for annualSalary of the Salaried Employee object
     * @return annualSalary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * the setAnnualSalary method
     * a setter for annualSalary of the Salaried Employee object
     * @param annualSalary
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
