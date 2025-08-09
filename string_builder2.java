// Program to Insert a character.

import java.util.Scanner;
public class string_builder2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        System.out.println("Your string is: "+sb);
        System.out.print("Enter the index number wher you want to insert a character: ");
        int n = sc.nextInt();
        
        // Insert function syntax:
        sb.insert(n,'n');
        System.out.println("After inserting a character at a given index: "+sb);
        
        System.out.print("Enter the starting index to delete character: ");
        int k = sc.nextInt();
        System.out.print("Enter the ending index to delete character: ");
        int m = sc.nextInt();

        // Delete function syntax between given range :
        sb.delete(k,m);  // NOTE: m se ek km tk delete hoga. 
        System.out.print("After deleting characters to a given range: "+sb);
        sc.close();
    }
}
