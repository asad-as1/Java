//Program to calculate power of a number(log n).

import java.util.Scanner;
public class recursion5
{
    public static int pow(int x,int n)
    {
        if(n==0)     // base case 1
        return 1;     
        if(x==0)     //base case 2
        return 0;
        {
        if(n%2==0)
        return pow(x,n/2) * pow(x,n/2);
        else
        return pow(x,n/2) * pow(x,n/2) *x;  //Suppose n=5 then x^2*x^2=x^4 thats why we multiply
        }                                   //by x extra for odd .
    }
    public static void main(String[] args)
    {
        System.out.print(" Enter the number and power: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.print("The power of a number by log method: "+pow(x,n));
    }
}
