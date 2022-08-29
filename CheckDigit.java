public class CheckDigit {
    public static void main(String[] args){
        System.out.println(getNumberOfDigits(12345));
        System.out.println(getNumberOfDigits(10000));
        System.out.println(getDigit(12345, 1));
        System.out.println(getDigit(12345, 5));
        System.out.println(getCheck(283415));
    }

    public static int getNumberOfDigits(int n){
        int pw = 10;
        int ans = 1;
        while (n >= pw){
            pw *= 10;
            ++ans;
        }
        return ans;
    }

    public static int getDigit(int n, int pos){
        pos = getNumberOfDigits(n)-pos;
        while (pos-- != 0) n /= 10;
        return n%10;
    }

    public static int getCheck(int n){
        int len = getNumberOfDigits(n);
        int ans = 0;
        for (int i=1; i<=len; ++i){
            ans += getDigit(n, i) * (8-i);
        }
        return ans%10;
    }
}
