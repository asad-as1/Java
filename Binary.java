// Convert a number decimal to binary.
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        int temp = n, ans = 0, pow = 0;
        while(temp > 0)
        {
            ans += (temp % 2)* Math.pow(10,pow);
            temp /= 2;
            pow++;
        } 
        System.out.print("Binary of " + n + " = " + ans);
    }
}
