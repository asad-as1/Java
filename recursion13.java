// Program to remove all the duplicates from the string.

import java.util.Scanner;
public class recursion13
{
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str,int idx,String newString)
    {
        if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true)
        removeDuplicates(str,idx+1,newString);
        else
        {
            newString += currChar;
            map[currChar-'a']= true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("String after removal of duplicates: ");
        removeDuplicates(str,0,"");
    }
}