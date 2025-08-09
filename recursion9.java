// Program to find the first and last occurance of the character.

import java.util.Scanner;
public class recursion9
{
public static void occurance(String name,char v,int i,int count,int k)
{
    if(i==name.length()&& count>0)
    {
        System.out.println("The last occurance is at index : "+k);
        return;
    }
    if(name.charAt(i)==v)
    {
    count++;
    k=i;
    }
    if(count==1&&k==i){
    System.out.println("The first occurance is at index : "+k);
    }
    occurance(name,v,i+1,count,k);
}
public static void main(String[] args)
{
    System.out.print("Enter the string: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.print("Enter the character: ");
    String chr = sc.next();
    char v = chr.charAt(0);
    sc.close();
    occurance(name,v,0,0,0);
}
}