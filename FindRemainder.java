// Find Remainder without using modulo operator

import java.util.*;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a / b;
        int num = b * d;
        System.out.print("Remainder: ");
        System.out.println(a - num);
    }
}