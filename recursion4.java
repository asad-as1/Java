// Program to calculate x^n (stack height = n).

import java.util.Scanner;
public class recursion4
{
    public static int pow(int x,int n)
    {
        int pro = 1;
        if(n==0)
        return 1;
        if(x==0)
        return 0;
        pro = x*pow(x,n-1);
        return pro;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number and power:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n =sc.nextInt();
        sc.close();
        System.out.print("The power of a number: "+(pow(x,n)));
    }
}
