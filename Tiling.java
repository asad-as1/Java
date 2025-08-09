// No. of ways to fill the 2*n board(Amazon)

public class Tiling {
    public static int find(int n) {
        if (n == 0 || n == 1) return 1;

        // int hori = find(n-1);
        // int vert = find(n-2);
        // int ans = hori + vert;

        return find(n-1) + find(n-2);
    }
    public static void main(String[] args) {
        // int n = 5;
        System.out.println(find(4));
    }
}