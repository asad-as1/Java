import java.util.Scanner;
public class switch1 
{
    public static void main(String[] args)
    {
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch(ch)
        {
        case 1:System.out.println("Assalamualaikum");
        break;
        case 2:System.out.println("Hello");
        break;
        case 3:System.out.println("Hey");
        break;
        default:System.out.println("Wrong Choice");
        break;    
        }
        sc.close();
    }
}
