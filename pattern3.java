import java.util.Scanner;
public class pattern3
{
    public static void main(String[] args)
    {
        System.out.print("Enter the numbers of rows: ");            //  n= 5
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();                                        // 1
        sc.close();                                                 //  12
        for(int i=1;i<=n;i++)                                      //   123
        {                                                         //    1234
            for(int j=1;j<=i;j++)                                //     12345
            System.out.print(j+" ");
            System.out.println();
        }
    }
}
