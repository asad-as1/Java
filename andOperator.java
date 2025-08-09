// Program to perform and bitwise operator 

import java.util.Scanner;
public class andOperator
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number and position: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        sc.close();
        int bitMask = 1<<pos;

        if((bitMask & n) == 0)
        System.out.println("Bit was zero");
        else
        System.out.println("Bit was one");
    }
}