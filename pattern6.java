// Program to print Palindomic Pyramid.
import java.util.Scanner;
public class pattern6
{
    public static void main(String[] args)
    {
        System.out.print("Enter the numbers of rows: ");            //    n= 5 
        Scanner sc = new Scanner(System.in);                          //      1
        int n = sc.nextInt();                                        //      212
        sc.close();                                                 //      32123
        for(int i=1;i<=n;i++)                                      //      4321234
        {                                                         //      543212345
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int j=i;j>=1;j--)
            System.out.print(j);
            for(int j=2;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
}
