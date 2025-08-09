import java.util.Scanner;
public class functionPrint
{
   public static void name(String word)
    {
        System.out.println("Your name is: "+word);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        name(word);
    }
}