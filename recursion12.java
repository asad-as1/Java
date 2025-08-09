// Program to remove all the given character in the the last of the string.
import java.util.Scanner;
public class recursion12
{
    public static void moveAll(String str,int idx,int count,String newString,char v)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            newString += v;
            System.out.println(newString);
            return;
        }
     char currChar = str.charAt(idx);
    if(currChar == v)
    {
        count++;
        moveAll(str,idx+1,count,newString,v);
    }
    else{
        newString += currChar;
        moveAll(str,idx+1,count,newString,v);
    }
}
public static void main(String[] args)
{
    System.out.print("Enter the string: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.print("Enter the character: ");
    String chr = sc.next();
    char v = chr.charAt(0);
    sc.close();
    System.out.println("After removal of same(given) character at last");
    moveAll(str,0,0,"",v);
}    
}