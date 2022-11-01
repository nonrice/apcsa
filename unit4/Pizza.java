import java.util.Arrays;

public class Pizza {
    private final int MX = 15;
    private String sa[] = new String[15];
    private int n = 0;
    
    public Pizza (String a[]) {
        for (String s : a) if (s != null && !s.equals("zzz")) ++n;
        
        int p2 = 0;
        for (String s : a){
            if (s != null && !s.equals("zzz")) sa[p2++] = s;
        }
        Arrays.sort(sa, 0, n);
    }
    
    public int getNumTopping(){
        return n;
    }
    
    public void printTopping(){
        for (int i=1; i<=n; ++i){
            System.out.println(i + ". " + sa[i-1]);
        }
    }
    
    public boolean addTopping(String s){
        if (n == 15) return false;
        int i=0;
        boolean f = false;
        for (; i<n; ++i){
            if (sa[i].compareTo(s) >= 0){
                f = true;
                break;
            }
        }
        
        for (int j=n; j>i; --j){
            sa[j] = sa[j-1];
        }
        sa[i] = s;
        ++n;
        return true;
    }
    
    public int binarySearch(String key){
        int cur = n;
        for (int step=n; step>=1; step/=2){
            while (cur-step>=0 && sa[cur-step].compareTo(key) >= 0) cur -= step;
        }
        
        if (cur!=n && sa[cur].equals(key)) return cur;
        return -1;
    }
}
        
