public class Intern extends Employee{
    private static final double SALARY_LIMIT = 20000;
    private double salary;

    public Intern(String name, String email, int age, double salary){
        super(name, email, age, salary);
        setSalary(salary);
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = Math.min(salary, SALARY_LIMIT);
    }

}
