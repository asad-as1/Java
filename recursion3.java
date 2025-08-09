// Program to print fibonacci series of n terms.

import java.util.Scanner;
public class recursion3
{
   public static void fibo(int n,int a,int b)
   { 
    if(n>0)
    {
    int sum=a+b;
    /*a=b;
    b=sum;*/
    System.out.print(sum+" ");
    fibo(n-1,b,sum);
    } 
    }
    public static void main(String[] agrs)
    {
        int a=0,b=1;
        System.out.print("Enter the number of terms: ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fibonacci series is :");
        System.out.print("0 1 "); 
        sc.close();
        fibo(n-2,a,b);
    }
}
