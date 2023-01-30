public class Student extends Person {
    private String myIdNum;
    private double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa){
        super(name, age, gender);

        myIdNum = idNum;
        myGPA = gpa;
    }

    public String getIdNum(){
        return myIdNum;
    }

    public double getGPA(){
        return myGPA;
    }

    public void setIdNum(String idNum){
        myIdNum = idNum;
    }

    public void setGPA(double gpa){
        myGPA = gpa;
    }

    public String toString(){
        return super.toString() + ", student id: " = myIdNum + ", gpa: " + myGPA;
    }
}
