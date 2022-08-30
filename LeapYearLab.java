import java.util.Scanner;

public class LeapYearLab {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year;
        do {
            System.out.print("Enter a year 1582 or greater (0 to quit): ");
            year = in.nextInt();
            if (year == 0) break;

            if (validity(year)){
                if (leap(year)){
                    System.out.println("\n" + year + " is a leap year");
                } else {
                    System.out.println("\n" + year + " is not a leap year");
                }
            } else {
                System.out.println("\nERROR: the year must be greater than 1581");
            }
        } while (year != 0);

        System.out.println("\nGood-bye");
        in.close();
    }

    public static boolean validity(int year){
        return year >= 1582;
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
