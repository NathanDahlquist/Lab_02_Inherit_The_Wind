import java.util.Objects;

public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double HourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, HourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(Worker worker, double annualSalary){
        super(worker.getFirstName(),
                worker.getLastName(),
                worker.getID(),
                worker.getTitle(),
                worker.getYOB(),
                worker.getHourlyPayRate());
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalaryWorker that = (SalaryWorker) o;
        return Double.compare(that.annualSalary, annualSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), annualSalary);
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                "annualSalary=" + annualSalary +
                '}';
    }

    /**
     * culculates the pay for one week by deviding the annual salary by 52, which is the amount of weeks in a year
     * @param hoursWorked unused. here for polymorphism
     * @return a double value of one week's pay
     */
    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return (annualSalary/52);
    }

    /**
     * displays the results of calculateWeeklyPay in the console
     * @param hoursWorked unused. here for polymorphism
     */
    @Override
    public void displayWeeklyPay(double hoursWorked){
        System.out.println("one week of the annual salary is $" + calculateWeeklyPay(hoursWorked));
    }
}
