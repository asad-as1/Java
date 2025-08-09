import java.util.Scanner;
public class if_else
{
    public static void main(String[] args)
    {
        System.out.print("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=18)
        System.out.println("Adult");
        else
        System.out.println("Not Adult");
        sc.close();
    }
}