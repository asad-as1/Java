// Program to print elements of the 2d array.
import java.util.Scanner; 
public class recursion11
{
    public static void arr(int a[][],int n,int k,int i,int j,int m)
    {
        if(k==m*n)
        return;
        System.out.print(a[i][j]+" ");
        j++;
        if(j==n)
        {
        System.out.println();
        j=0;
        i++;
        }
        arr(a,n,k+1,i,j,m);
    }  
public static void main(String[] args)
{
    System.out.print("Enter the row and columns of the 2d array: ");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int a[][]= new int[m][n];
    System.out.println("Enter the elements:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
        a[i][j]=sc.nextInt();
        }
    }
    System.out.println("The 2d array are: ");
    sc.close();
    arr(a,n,0,0,0,m);
}
}
