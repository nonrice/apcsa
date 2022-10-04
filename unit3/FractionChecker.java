import java.util.Arrays;

public static class FractionChecker {
    public static void main(String[] args){
        Random rnd = new Random();
        FractionUnit3 f[] = new FractionUnit3[20];
        for (int i=0; i<20; ++i){
            int n = rand.nextInt(20);
            ind d = rand.nextInt(19)+1;
            f[i] = new FractionUnit3(n, d);
        }
    }
    
    public static void sorting(FractionUnit3 arr[]){
        Arrays.sort(arr);
    }
}
