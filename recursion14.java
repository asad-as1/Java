// Program to print all the possible subsquences of the string.

import java.util.Scanner;
public class recursion14
{
    public static void subSquences(String name,int i,String str)
    {
        if(i==name.length())
        {
            System.out.println(str);
            return;
        }
        char curr = name.charAt(i);
        subSquences(name,i+1,str+curr);
        subSquences(name,i+1,str);
    }
public static void main(String[] args)
{
    System.out.println("Enter the string:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    sc.close();
    System.out.println("All the possible subsquences are:");
    subSquences(name,0,"");
}
}
