import java.util.Scanner;
public class array1
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[]=new int[n];
        System.out.println("Enter the elements:");

     /* marks[0]=79;
        marks[1]=97;
        marks[2]=99; */

        for(int i=0;i<n;i++)
        marks[i]= sc.nextInt();
        System.out.println("The elements are:");
        for(int i=0;i<n;i++)
        System.out.print(marks[i]+" ");
        sc.close();
    }
}