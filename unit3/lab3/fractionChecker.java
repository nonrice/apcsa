// Eric Xue PD5

import java.util.Arrays;
import java.util.Random;

public class FractionChecker {
    public static void main(String[] args){
        Random rnd = new Random();
        FractionUnit3 f[] = new FractionUnit3[20];
        for (int i=0; i<20; ++i){
            int n = rnd.nextInt(20);
            int d = rnd.nextInt(19)+1;
            f[i] = new FractionUnit3(n, d);
        }
        
        sorting(f);
    }
    
    public static void sorting(FractionUnit3 arr[]){
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        System.out.println("Fraction        Decimal Value");
        for (int i=0; i<arr.length; ++i){
            System.out.println(i+1 + ")   " + arr[i].toString() + "      " + arr[i].decimalValue());
        } 
    }
}
