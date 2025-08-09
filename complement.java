// Program to find the complement of a number.


// For positive and negative numbers it gives :    -(n+1), as an output.

import java.util.Scanner;
class complement{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("The complement of a number is : " + ~n);
        sc.close();
    }
}