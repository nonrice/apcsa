// Eric Xue PD6

public class SimpleDate {
    private int d=1, m=1, y=1;
    private static int MSZ = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final String MNM = {
        "",
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "November",
        "December"
    }
    
    public SimpleDate(int y){
        this.y = y;
    }
    
    public SimpleDate(int m, int y){
        this.m = m;
        this.y = y;
        repairVars();
    }
    
    public SimpleDate(int d, int m, int y){
        this.d = d;
        this.m = m;
        this.y = y;
        repairVars();
    }
    
    private void repairVars(){
        if (m < 1 || m > 12) m = 1;
        if (d < 1 || d > MSZ[m]) d = 1;
        if (isLeapYear()) MSZ[2] = 29;
    }
    
    public void advanceDay(){
        if (++d > MSZ[m]){
            d -= MSZ[m];
            advanceMonth();
        }
    }
        
    public void advanceMonth(){
        if (++m > 12){
            m = 1;
            advanceYear();
        }
        
        if (d > MSZ[m]){
            d -= MSZ[m];
            if (++m > 12){
                m = 1;
                advanceYear();
            }
        }
    }
    
    public void advanceYear(){
        ++y;
        if (isLeapYear()) MSZ[2] = 29;
        else MSZ[2] = 28;
    }
    
    public int daysInMonth(){
        return MSZ[m];
    }
    
    public int getDay(){
        return d;
    }
    
    public String getLongDate(){
        return MNM[m] + " " + d + ", " + y;
    }
    
    public int getMonth(){
        return m;
    }
    
    public String getShortDate(){
        return m + "/" + d + "/" + y;
    }
    
    public int getYear(){
        return y;
    }
    
    public static boolean leap(int year){
        if (year%4 == 0){
            if (year%100 == 0){
                return year%400 == 0;
            }
            return true;
        }
        return false;
    }
}
        
    
    
    
    
        
