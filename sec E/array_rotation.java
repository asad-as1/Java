// Write a program that rotates the elements of an array to the left by a specified number of positions.

import java.util.Scanner;
public class array_rotation {

    public static void rotate(int[] a){
        int temp = a[a.length-1];
        for (int i=a.length-1; i>0; i--){
            a[i] = a[i-1];
        }
        a[0] = temp;
    }

    public static void RotationN(int[] a, int n){
        for(int i=0; i<n; i++){
            rotate(a);
        }
    }

    public static void print(int []a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        int [] a = {1,2,3,4,5,6};
        System.out.print("Enter how many times you want to rotate array: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        RotationN(a, n);
        print(a);
    }
}
