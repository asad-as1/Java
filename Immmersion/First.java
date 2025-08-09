import java.util.*;
public class First {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i=0; i<n; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Primes no. are : ");
        for(int i=0; i<n; i++) {
            boolean b = prime(a[i]);
            if(b == true) System.out.print(a[i] + " ");
        }
        sc.close();
    }

    public static boolean prime(int n) {
        if(n == 1 || n == 0) return false;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}

// Basics of java :
// 1: loop
// 2: if else (nested if else)
// 3. break and continue
// 4. switch case
// 5. public static void main(String args[]) static why ? in main fn.

// roll no. 7