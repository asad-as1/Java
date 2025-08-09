//  1. Bubble Sort
// Working:
// Repeatedly compares adjacent elements.
// Swaps them if they are in the wrong order.
// Largest element "bubbles" to the end in each pass.

// Time Complexity:
// Worst: O(n²)
// Best: O(n²) or O(n) (if optimized with a flag for no swaps) 


import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");

        for(int i=0;i<n;i++)  a[i]=sc.nextInt();
        
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++)  System.out.print(a[i]+" ");
        
        sc.close();
    }
}