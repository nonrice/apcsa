import java.util.Arrays;

public class ArrayExercises {
    public static int[] insert(int a[], int v, int p){
        if (p < 0 || p > a.length) return a;
        int ans[] = new int[a.length+1];
        for (int i=0; i<p; ++i) ans[i] = a[i];
        for (int i=p+1; i<a.length+1; ++i) ans[i] = a[i-1];
        ans[p] = v;

        return ans;
    }

    public static int maxProduct(int a[]){
        int mx1, mx2, mn1, mn2;
        mx1 = mn1 = a[0];
        mx2 = mn2 = a[1];
        for (int i=2; i<a.length; ++i){
            if (a[i] >= mx1){
                mx2 = mx1;
                mx1 = a[i];
            } else if (a[i] > mx2){
                mx2 = a[i];
            }

            if (a[i] <= mn1){
                mn2 = mn1;
                mn1 = a[i];
            } else if (a[i] < mn2){
                mn2 = a[i];
            }
        }

        return Math.max(mx1*mx2, mn1*mn2);
    }

    public static int[] evenOdd(int a[]){
        int e=0, o=0;
        for (int v : a){
            if (v%2 == 1) ++o;
            else ++e;
        }
        
        int ans[] = new int[a.length];
        int p1=0, p2=e;
        for (int v : a){
            if (v%2 == 1){
                ans[p2] = v;
                ++p2;
            } else {
                ans[p1] = v;
                ++p1;
            }
        }

        return ans;
    }

    public static void printLeaders(int a[]){
        if (a.length == 0) {
            System.out.println("none");
            return;
        }
    
        int mx = Integer.MIN_VALUE;
        int suf[] = new int[a.length];
        suf[a.length-1] = a[a.length-1];
        for (int i=a.length-2; i>=0; --i){
            suf[i] = Math.max(suf[i+1], a[i]);
        }
        
        if (suf[0] != suf[a.length-1]){
            System.out.print(suf[0] + " ");
            for (int i=1; i<a.length; ++i){
                if (suf[i] != suf[i-1] && suf[i] != suf[a.length-1]) System.out.print(suf[i] + " ");
            }
            
            System.out.println();
        } else {
            System.out.println("none");
        }
    }

    public static int largestNumber(int a[]){
        int d[] = new int[10];
        for (int v : a){
            ++d[v];
        }

        int ans = 0;
        int pw = 1;
        for (int i=0; i<10; ++i){
            while (d[i]-->0){
                ans += i*pw;
                pw *= 10;
            }
        }

        return ans;
    }

    public static void closestToZero(double b[]){
        int bsti=0, bstj=1;
        double bst = b[0] + b[1];
        for (int i=0; i<b.length; ++i){
            for (int j=i+1; j<b.length; ++j){
                if (Math.abs(b[i] + b[j]) < bst){
                    bst = Math.abs(b[i] + b[j]);
                    bsti = i;
                    bstj = j;
                }
            }
        }

        System.out.println(b[bsti] + " and " + b[bstj]);
    }

    public static int[] productArray(int a[]){
        int b[] = new int[a.length];
        int p = a[0];
        b[0] = 1;
        for (int i=1; i<a.length; ++i){
            b[i] = p;
            p *= a[i];
        }
        
        p = a[a.length-1];
        for (int i=a.length-2; i>=0; --i){
            b[i] *= p;
            p *= a[i];
        }

        return b;
    }
}
