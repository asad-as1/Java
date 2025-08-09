// Program to find the factorial of a number.

import java.util.Scanner;
public class recursion2
{
    public static int fact(int n)
    {
        int mul;
        if(n==0||n==1)
        return 1;
        mul=n*fact(n-1);
        return mul;
    }
    public static void main(String args[])
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print("The factorial of number is: "+fact(n));
    }
}
