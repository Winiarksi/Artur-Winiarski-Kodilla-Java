package challenges.ExperimentalTrainingGround;

public class Application {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);
        processor.processPayout();


    }
}
