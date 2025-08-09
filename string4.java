// Program to calculate length of the string without using built-in-function.

import java.util.Scanner;
public class string4
{
    public static void main(String[] args) //throws Exception
    {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        int i=0;
        for(char c: name.toCharArray())
        {
            System.out.print(c);
            i++;
        }
        System.out.println();
        System.out.println("The length of the string is: "+i);
    }
}
