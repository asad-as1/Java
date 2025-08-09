// Solid Rhombus.
import java.util.Scanner;
public class pattern8
{
    public static void main(String[] args)
    {                                                                    // n= 5
        System.out.print("Enter the number of rows: ");               //  *****
        Scanner sc = new Scanner(System.in);                            //  *****
        int n = sc.nextInt();                                          //  *****
        sc.close();                                                   //  ***** 
        for(int i=1;i<=n;i++)                                        //  *****
        {
            for(int j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(int j=1;j<=n;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}
/*for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=(2*n)-i;j++)
        {
            if(j<=n-i)
            System.out.print(" ");
            else
            System.out.print("*");
        }
        System.out.println();
    } */