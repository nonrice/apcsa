public class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String myName, int myAge, String myGender, String subject, double salary){
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
