import java.util.Scanner;
public class linearSearch
{
    public static void main(String[] args)
    {
        System.out.print("Enter the the size of the array: ");
        Scanner bc = new Scanner (System.in);
        int n = bc.nextInt();
        // Syntax of declaring an array.
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=bc.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        int k = bc.nextInt();
        int flag =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
            flag=1;
            System.out.println("Element found at index: "+i);
            break;
            }
        }
        if(flag==0)
        System.out.println("Element is not present in the array");
        bc.close();
    }
}
