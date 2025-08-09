// No. of ways to pair with friends or you can also remain single . One pair only once.

public class FriendsPair {
    public static int find(int n) {
        if(n == 1 || n == 2) return n;
        
        // single
        int sin = find(n-1);

        int pair = (n-1) * find(n-2);  // I can pair with (n-1) persons.
        return sin + pair;
    }

    public static void main(String[] args) {
        //int n = 5;
        System.out.println(find(3));
    }
}