import java.util.Scanner;
public class sum_n_numbers
{
    public static void main(String[] args)
    {
        System.out.print("Enter the upto want to sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=1;i<=n;i++)
        sum=sum+i;
        System.out.println("Sum = "+sum);
    }
}
