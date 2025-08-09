import java.util.Scanner;
public class pattern5
{
    public static void main(String[] args)
    {
        System.out.print("Enter the numbers of rows: ");           // n= 5
        Scanner sc = new Scanner(System.in);                         //  1
        int n = sc.nextInt();                                       //   0 1
        sc.close();                                                //    1 0 1
        for(int i=1;i<=n;i++)                                     //     0 1 0 1
        {                                                        //      1 0 1 0 1
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
