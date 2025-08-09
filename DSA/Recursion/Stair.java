public class Stair {
    public static int find(int n, int ans) {
        if(n == 0) {
            return 1;
        } 
        
        if(n < 0) return 0;
        int a = find(n-1, ans+1);
        int b = find(n-2, ans+1);
        int c = find(n-3, ans+1);
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(find(4, 0));
    }
}