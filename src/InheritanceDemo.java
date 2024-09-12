import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        Worker Nathan = new Worker("Nathan","Dahlquist","000001","Mr.",2003,20);
        workers.add(Nathan);

        Worker AJ = new Worker("Anna","Dahlquist","000002","Ms.",2005,24);
        workers.add(AJ);

        Worker Nacho = new Worker("Lucas","Gleuge","000003","Mr.",2006,19);
        workers.add(Nacho);

        SalaryWorker John = new SalaryWorker("John","Dahlquist","000004","Mr.",1999,25,52000);
        workers.add(John);

        SalaryWorker Aidan = new SalaryWorker("Aidan","Evans","000005","Mr.",2004,19,39520);
        workers.add(Aidan);

        SalaryWorker Gabby = new SalaryWorker("Gabriella","Piper","000006","Mrs.",2004,20,41600);
        workers.add(Gabby);

        for(Worker w : workers){
            double week1 = (w.getHourlyPayRate() * 40);
            double week2 = (w.getHourlyPayRate() * 50);
            double week3 = (w.getHourlyPayRate() * 40);
            //System.out.printf("\n%-8s%-25s%-50s%6.1f", id, name, description, cost);
            System.out.printf("\nWeek 1 %-15s%-15s%6.2f", w.getFirstName(), w.getLastName(), week1);
            System.out.printf("\nWeek 2 %-15s%-15s%6.2f", w.getFirstName(), w.getLastName(), week2);
            System.out.printf("\nWeek 3 %-15s%-15s%6.2f", w.getFirstName(), w.getLastName(), week3);
        }
    }
}
