// Program to add(append) characters in the last of the string.

import java.util.Scanner;
public class stringBuilder3
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.print("Enter the numbers of characters you want to insert: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter the charcter: ");
            String m = sc.next();  // NOTE: yha agr nextLine ka use kre toh i 1 bar km chalega.
            sb.append(m);          
        }
        sc.close();
        System.out.println("Your string after adding characters: "+sb);
    }
}
