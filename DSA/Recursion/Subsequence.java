public class Subsequence {
    public static void find(String s, String ans, int i) {
        if(i == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        find(s, ans+s.charAt(i), i+1);
        find(s, ans, i+1);
       
    }
    public static void main(String[] args) {
        find("abc", "", 0);
    }
}