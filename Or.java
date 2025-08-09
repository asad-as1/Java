// Bitwise Or formula = -(n+1)
import java.util.Scanner;
public class Or {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The Or of this number " + n + " : " + ~n);
        sc.close();
    }
}
