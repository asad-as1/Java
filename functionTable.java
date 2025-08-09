import java.util.Scanner;
public class functionTable
{
    public static void table(int n)
    {
        System.out.println("Table of: "+n);
        for(int i=1;i<=10;i++)
        System.out.println(n*i);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        sc.close();
        table(a);
    }
}