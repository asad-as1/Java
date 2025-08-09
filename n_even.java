// Even Numbers

import java.util.Scanner;
public class n_even
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number upto you want to print even numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("All evens numbers from 0 to :"+n);
        for(int i=0;i<=n;i += 2)
        {
            // if(i%2==0)
            System.out.print(i+" ");
        }
    }
}
