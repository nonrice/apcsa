public class Student implements Gradable {
    private String name;
    private int cnt = 0;
    private double avg = 0;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addTestScore(double s){
        avg = (avg*cnt + s)/(++cnt);
    }

    public double getPercent(){
        return avg;
    }

    public boolean isPassing(){
        return avg>=60;
    }
}
