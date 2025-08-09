// Program to Reverse a string.

import java.util.Scanner;
public class reverseString
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        //String name = "Hello";

        StringBuilder sb = new StringBuilder(name);
        for(int i=0;i<sb.length()/2;i++)
        {
            int f=i;
            int b=sb.length()-1-i;

            char fc = sb.charAt(f);
            char bc = sb.charAt(b);

            sb.setCharAt(f,bc);
            sb.setCharAt(b,fc);
        }
        System.out.print("Reverse String is: "+sb);
        sc.close();
    }
}
