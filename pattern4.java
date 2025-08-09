import java.util.Scanner;
public class pattern4
{
    public static void main(String[] args)
    {
        System.out.print("Enter the numbers of rows: ");          //  n= 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                      // 1
        sc.close();                                               //  2 3 
        int k=0;                                                 //   4 5 6
        for(int i=1;i<=n;i++)                                   //    7 8 9 10
        {                                                      //     11 12 13 14 15
            for(int j=1;j<=i;j++)
            System.out.print(++k+" ");
            System.out.println();
        }
    }
}
