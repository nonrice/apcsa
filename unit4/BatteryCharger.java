public class BatteryCharger {
    private int a[];
    
    public BatteryCharger(int a[]){
        this.a = a;
    }
    
    public int getChargeStartTime(int t){
        int cur = 0;
        for (int i=0; i<t; i=(i+1)%24) cur += a[i];
        
        int bst = cur;
        int bst_i = 0;
        for (int i=0; i<24; ++i){
            cur += a[(i+t)%24] - a[i];
            if (cur < bst){
                bst_i = i;
                bst = cur;
            }
        }
        
        return bst_i;
    }
}
                
    
    
