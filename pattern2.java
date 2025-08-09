import java.util.Scanner;
public class pattern2
{
    public static void main(String[] args)                              
    {                                                                  // n= 5
        System.out.print("Enter the number of row: ");               
        Scanner sc = new Scanner(System.in);                         //  12345
        int n = sc.nextInt();                                       //   1234
        sc.close();                                                //    123
        for(int i=n;i>=1;i--)                                     //     12
        {                                                        //      1
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
