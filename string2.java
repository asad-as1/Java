// Program to compare two strings.
import java.util.Scanner;
public class string2
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        sc.close();
        // Compare function  { [string1.compareTo(string2)] }.
        // isme if(string1==string2) bhi kr skte hai lekin ye kuch test cases mai fail ho jata.

        //1 s1>s2 : +ve value
        //2 s1==s2 :0
        //3 s1<s2 : -ve value
        if(name1.compareTo(name2)==0)
        System.out.println("Strings are equal");
        else if(name1.compareTo(name2)>=1)
        System.out.println("String1 is greater");
        else
        System.out.println("String2 is greater");

    }
}
