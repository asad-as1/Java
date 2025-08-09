import java.util.*;
public class MappedString {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = new ArrayList<>();
        find(n, "", ans);
        sc.close();

        Collections.sort(ans);

        for(String s: ans) System.out.println(s);
    }
    public static void find(int n, String temp, List<String> ans) {
        if(n == 0) {
            ans.add(temp);
            return;
        }
        
        if(n%100 <= 26 && n%100 >= 10) {
            char c = (char)('A' + (n%100) - 1);
            find(n/100, c + temp, ans);
        }

        char c = (char)('A' + (n%10) - 1);
        find(n/10, c + temp, ans);

        return;
    }
}
