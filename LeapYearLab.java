public class SimpleDate {
    private int d=1, m=1, y=1;
    private int MSZ[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final String MNM[] = {
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
    };
    
    public SimpleDate(int y){
        this.y = y;
        repairVars();
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
        if (isLeapYear()) MSZ[2] = 29;
        if (m < 1 || m > 12) m = 1;
        if (d < 1 || d > MSZ[m]) d = 1;
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
        
        d = Math.min(d, MSZ[m]);
    }
    
    public void advanceYear(){
        ++y;
        if (isLeapYear()) MSZ[2] = 29;
        else {
            MSZ[2] = 28;
            if (d == 29) d = 28;
        }
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
    
    public boolean isLeapYear(){
        if (y%4 == 0){
            if (y%100 == 0){
                return y%400 == 0;
            }
            return true;
        }
        return false;
    }
}
