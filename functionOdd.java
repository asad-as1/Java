import java.util.Scanner;
public class functionOdd
{
    public static void sumOdd(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2!=0)
            sum=sum+i;
        }
        System.out.print("Sum of all odd numbers = "+sum);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number upto you want to sum: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        sumOdd(a);
    }
}