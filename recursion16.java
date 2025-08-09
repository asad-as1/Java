// Program to check it is a strictly increasing array.

import java.util.Scanner;
class recursion16{
    public static boolean sub(int a[],int i,int c,int n){
        if(i==n-1)
        return true;
        if(a[i]>=a[i+1])
        return false;
        return sub(a,i+1,c,n);
    }
     public static void main(String[] args){
     System.out.print("Enter the size: ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a[]=new int [n];
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     sc.close();
    System.out.print(sub(a,0,0,n));
    }
}