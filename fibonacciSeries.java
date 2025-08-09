import java.util.Scanner;
public class fibonacciSeries
{
    public static void main(String[] args) {
        int sum=0,i=0,a=0,b=1;
        // System.out.print("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
        // System.out.print("0 1 ");
        // for(i=1; i<=(n-2); i++) {
        //     sum = a + b;
        //     a = b;
        //     b = sum;
        //     System.out.print(b + " ");
        // }

        System.out.println(recur(3-1));
    }

    public static int recur(int n) {
        if (n <= 1) {
            return n;
        }
        return recur(n - 1) + recur(n - 2);   // 0 1 1
    }
}