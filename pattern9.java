import java.util.Scanner;
public class pattern9
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows: ");       // n= 5
        Scanner sc = new Scanner(System.in);                   //         1
        int n = sc.nextInt();                                 //         2 2
        sc.close();                                          //         3 3 3
        for(int i=1;i<=n;i++)                               //         4 4 4 4
        {                                                  //         5 5 5 5 5
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
/*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                System.out.print(" ");
                else
                System.out.print(i+" ");
            }
            System.out.println(); */
