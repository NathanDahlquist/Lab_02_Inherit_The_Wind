import java.util.Objects;

public class Worker extends Person {
    private double HourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double HourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.HourlyPayRate = HourlyPayRate;
    }
    public Worker(Person person, double HourlyPayRate)
    {
        super(person.getFirstName(),
                person.getLastName(),
                person.getID(),
                person.getTitle(),
                person.getYOB());
        this.HourlyPayRate = HourlyPayRate;
    }

    public Worker(){
    }

    public double getHourlyPayRate() {
        return HourlyPayRate;
    }

    public void setHourlyPayRate(double HourlyPayRate) {
        this.HourlyPayRate = HourlyPayRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.HourlyPayRate, HourlyPayRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), HourlyPayRate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "HourlyPayRate=" + HourlyPayRate +
                '}';
    }

    /**
     * Calculates the amount of money the worker would receive for the week
     * @param hoursWorked double value of hours worked that week
     * @return the amount of money made that week as a double value
     */
    public double calculateWeeklyPay(double hoursWorked)
    {
        if(hoursWorked > 40)
        {
            return (HourlyPayRate * 40) + ((hoursWorked-40)*(HourlyPayRate * 1.5));
        }
        else
        {
            return HourlyPayRate * hoursWorked;
        }
    }

    /**
     * displays the results of calculateWeeklyPay in the console
     * @param hoursWorked double value of hours worked that week
     */
    public void displayWeeklyPay(double hoursWorked){
        double pay = calculateWeeklyPay(hoursWorked);
        if(hoursWorked > 40){
            System.out.println("You worked 40 hours of normal pay and " + (hoursWorked-40) + " of overtime for a total " +
                    "weekly pay of $" + pay);
        }
        else{
            System.out.println("You worked " + hoursWorked + " and got payed $" + pay);
        }
    }
}
