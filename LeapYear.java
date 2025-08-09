import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();   // 1900 is not a leap year

        if(year % 400 == 0) {   // 1900 is divisible by 4
            System.out.println("Leap Year");
            return;
        }
        if(year % 100 == 0) { // year which is divisible by 4 not by 400
            System.out.println("Not leap Year");
            return;
        }
        if(year % 4 == 0) { // 2016
            System.out.println("Leap Year");
            return;
        }
        System.out.println("Not a leap year");
    }
}