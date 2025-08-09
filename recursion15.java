// Program to print all the unique subsquences of the string.

import java.util.HashSet;
import java.util.Scanner;
public class recursion15
{
    public static void subSquences(String name,int i,String str,HashSet<String>set)
    {
        if(i==name.length())
        {
            if(set.contains(str))
            {
                return;
            }
            else {
                System.out.println(str);
                set.add(str);
                return;
            }
        }
        char curr = name.charAt(i);
        subSquences(name,i+1,str+curr,set);
        subSquences(name,i+1,str,set);

    }
public static void main(String[] args)
{
    System.out.println("Enter the string:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    sc.close();
    System.out.println("All the possible subsquences are:");
    subSquences(name,0,"",new HashSet<>());
}
}
