// Program to find an element in the 2d array.
import java.util.Scanner;
public class d2_array
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number or rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p=0,q=0,flag=0;
        // Declaration of 2d array.
        int a[][] = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter the element: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to search: ");
        int k = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                if(a[i][j]==k)
                {
                    p=i;
                    q=j;
                    flag=1;
                }
            }
            System.out.println();
        }
        
                
        if(flag==1)
        System.out.print("The indices of the element are: "+p+" and "+q);
        else
        System.out.print("Element is not in the the 2d array");
        sc.close();
    }
}