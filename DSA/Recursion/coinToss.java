// package Recursion;

public class coinToss {
    public static void find(int n, String s) {
        if(n == 0) {
            System.out.print(s + " ");
            return;
        }  
        if(s.length() == 0 || s.charAt(s.length()-1) != 'H')
        find(n-1, s+"H");
        find(n-1, s+"T");
    }
    public static void main(String[] args) {
        find(3, "");
    }
}
