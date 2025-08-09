/* Program to implement Selection sort.Isme ek bar j loop chlne se hmare ps sbse chote element
  ka index mil jayega.*/

//   2. Selection Sort

// Working:
// Repeatedly finds the minimum element from unsorted part.
// Places it at the beginning of the array.

// Time Complexity:
// Worst: O(n²)
// Best: O(n²)


import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        sc.close();

        for(int i=0; i<n-1; i++) {
            int smallest = i;
            for(int j=i+1; j<n; j++) {
                if(a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }

        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        
    }
}