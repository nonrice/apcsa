public class BatteryCharger {
    private int a[];
    
    public BatteryCharger(int a[]){
        this.a = a;
    }
    
    public int getChargingCost(int h, int t){
        if (h<0 || h>23 || t<0) return -1;
        int sum = 0;
        for (int i=h; i<h+t; ++i) sum += a[i%24];
        return sum;
    }
    
    public int getChargeStartTime(int t){
        if (t < 0) return -1;
        int cur = getChargingCost(0, t);
        int bst = cur;
        int bst_i = 0;
        for (int i=0; i<24; ++i){
            cur += a[(i+t)%24] - a[i];
            if (cur < bst){
                bst_i = (i+1)%24;
                bst = cur;
            }
        }
        
        return bst_i;
    }
}
                
    
                                                                           
