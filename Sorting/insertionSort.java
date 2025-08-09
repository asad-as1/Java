// 🔸 3. Insertion Sort
// Working:

// Builds sorted array one item at a time.
// Picks an element and inserts it into its correct position in the sorted part.

// Time Complexity:
// Worst: O(n²)
// Best: O(n) (already sorted)

// Space: O(1)

import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)  a[i] = sc.nextInt();

        for(int i=1;i<n;i++) {
            int current = a[i];
            int j = i-1;
            while(j>=0 && current<a[j]) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }

        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++) System.out.print(a[i]+" "); 
        sc.close();
    }
}