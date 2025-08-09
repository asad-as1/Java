// Program to find the occurance of a character.

import java.util.Scanner;
public class recursion8
{
    public static void occurance(String str,String chr,int count,int i)
    {

        char v = chr.charAt(0);
        if(i==str.length())
        {
            System.out.print("Occurance of character "+v+" is: "+count);
            return;
        }
        if(v==str.charAt(i))
        {
            count++;
        }
        occurance(str,chr,count,i+1);
        
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Enter the character: ");
        String n = sc.next(); 
        sc.close();
        int count=0,i=0;
        occurance(name,n,count,i);
    }
}
