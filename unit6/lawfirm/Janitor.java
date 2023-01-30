public class Janitor extends Employee {
    public double getSalary(){
        return super.getSalary() - 10000;
    }

    public void clean(){
        System.out.println("Workin' for the man");
    }
}
