//Program to reverse a string:
import java.util.Scanner;
public class recursion7
{
    public static void stringRev(String str,int x)
    { 
        StringBuilder sb = new StringBuilder(str);
        if(x>=0)
        {
        System.out.print(sb.charAt(x));
        stringRev(str,x-1);
        }
    }public static void main(String[] args)
    {
        System.out.print("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //String name = "asad";
        sc.close();
        stringRev(name,name.length()-1);
    }
}
