import java.util.Scanner;
class functionSum
{
    public static int sum(int x,int y)
    {
        int c;
        c=x+y;
        return c;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Addition = "+sum(a,b));
    }
}
