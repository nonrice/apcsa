public class CollegeStudent extends Student {
    String major;
    int year;

    CollegeStudent(String myname, int myAge, String myGender, String myIdNum, double myGPA, int year, String major){
        super(myname, myAge, myGender, myIdNum, myGPA);
        this.year = year;
        this.major = major;
    }
    
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String toString(){
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
