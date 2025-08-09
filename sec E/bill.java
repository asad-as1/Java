import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your food type: ");
        String t = sc.next();

        System.out.print("Enter the quantity: ");
        int q = sc.nextInt();

        System.out.print("Enter the distance: ");
        int d = sc.nextInt();
        sc.close();
         
        int ans = 0;
        if(t.charAt(0) == 'V')
        ans = q*12;
        else
        ans = q*15;

        if(d > 3 && d < 7)
        ans += (d-3);
        if(d > 6)
        ans = ans + 3 + 2*(d-6);

        System.out.print("Total bill is : " + ans);
    }
}
