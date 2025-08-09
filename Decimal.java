// Convert a number binary to decimal.
import java.util.Scanner;
public class Decimal{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int n = sc.nextInt();
        sc.close();
        int temp = n, ans = 0, pow = 0;
        while(temp > 0)
        {
            ans += (temp % 10)* Math.pow(2,pow);
            temp /= 10;
            pow++;
        } 
        System.out.print("Decimal of " + n + " = " + ans);
    }
}