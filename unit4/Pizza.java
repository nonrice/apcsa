import java.util.Arrays;

public class Pizza {
    private final int MX = 15;
    private String sa = new String[15];
    private int n = 0;
    
    public Pizza (String a[]) {
        for (String s : a) if (s != null) ++n;
        
        int p2 = 0;
        for (String s : a){
            if (s != null) sa[p2++] = s;
        }
    }
    
    public int getNumTopping(){
        return n;
    }
    
    public void printTopping(){
        for (int i=1; i<=n; ++i){
            System.out.println((i+1) + ". " + sa[i]);
        }
    }
    
    public boolean addTopping(String s){
        if (n == 15) return false;
        int p = binarySearch(s);
        for (int i=p+1; i<15; ++i){
            sa[i] = sa[i-1];
        }
        sa[p] = s;
    }
    
    public int binarySearch(String key){
        int cur = -1;
        for (int step=n; step>=1; step/=2){
            while (sa[cur+step].compareTo(key) < 0) cur += step;
        }
        
        return sa[cur+1].equals(key);
    }
        
