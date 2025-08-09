// As Strings are Immutable that is we can not change or modify our string after declaration of string.
// To overcome this problem Java provide you StringBuilder function.
// String builder are those that allows you to change or modify the string.

import java.util.Scanner;
public class string_builder
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        //System.out.println(sb);
        
        //char at index k
        System.out.print("Enter the index of the char to print: ");
        int k = sc.nextInt();
             // Syntax of charAt
        System.out.println(sb.charAt(k));

        //set char at index i
        System.out.print("Enter the index to set char: ");
        int i = sc.nextInt();
        System.out.print("Enter the ASCII code of the Character: ");
        char fb = (char) sc.nextInt();
        sb.setCharAt(i,fb);
        System.out.println(sb);
        sc.close();
    }
}
