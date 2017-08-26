package challenges.ExperimentalTrainingGround;

class FixedSalaryEmployee implements Employee {

    private double salary;
    private double  premia;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}