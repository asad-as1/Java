import java.util.Scanner;
public class loop2
{
    public static void main(String[] args)
    {
        System.out.print("How many times you want to print: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while(i<n)
        {
            System.out.println("Hello Asad");
            i++;
        }
    }
}
