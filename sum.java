import java.util.Scanner;
public class sum
{
   public static void main(String[] args)
   {
    System.out.print("Enter two number: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b=sc.nextInt();
    sc.close();
    int c = a+b;
    System.out.println("Sum = "+c+"\nMul = "+(a*b)+"\ndiff = "+(a-b)); 
   } 
}
