// Program to print number of characters.
// Strings are Immutable.

import java.util.Scanner;
public class string3
{
   public static void main(String[] agrs)
   {
    System.out.print("Enter the string: ");
    Scanner sc =  new Scanner(System.in);
    String name = sc.nextLine();
    System.out.print("Enter the begining index: ");
    int k = sc.nextInt();
    System.out.print("Enter the index where upto want to print:");
    int m = sc.nextInt();
   // Syntax of substring   {[   string1.substring(index,upto_index)  ]}.

    String part = name.substring(k,m);

   // Syntax2 {{   srting1.substring(staring_index)}}.
   //In this case no need to last index bydefault it take last index (if we want to print till last). 
    
    System.out.println(part);
    sc.close();
   } 
}
