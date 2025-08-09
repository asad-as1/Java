// Program to sum of n natutral numbers.

import java.util.Scanner;
public class recursion1
{
public static int sum(int n)
{
    int add = 0; 
    if(n==0)
    return 1;
    add = n+sum(n-1);
    return add;
}
    public static void main(String[] args)
    {
        System.out.print("Enter the number wher upto want to sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print("The sum of n natural numbers is: "+sum(n));
    }
}