// Program to print elements of the array.
import java.util.Scanner; 
public class recursion10
{
    public static void arr(int a[],int i,int n)
    {
        if(i==n)
        return;
        System.out.print(a[i]+" ");
        arr(a,i+1,n);
    }  
public static void main(String[] args)
{
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]= new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("The array elements are: ");
    sc.close();
    arr(a,0,n);
}
}
