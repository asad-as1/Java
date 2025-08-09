import java.util.*;
public class AsciiSubsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        ArrayList<String> ans = new ArrayList<>();
        find(ans, "", 0, s);
        System.out.println(ans);
        System.out.println(ans.size());
    }
     
    public static void find(ArrayList<String> ans, String temp, int i, String s) {
        if(i == s.length()) {

            ans.add(temp);

            // String x = "";
            // for(int l=0; l<temp.length(); l++) {
            //     int q = temp.charAt(l);
            //     String d = temp.substring(0,l)+q+temp.substring(l+1);
            //     ans.add(d);
            //     if(temp.length() > 1) {
            //         x += q+"";
            //         if(l != 0)
            //         ans.add(x);
            //     }
            // }

            return;
        }

        int n = s.charAt(i);
        find(ans, temp, i+1, s);   // not take it
        find(ans, temp+s.charAt(i), i+1, s);   // take it
        find(ans, temp+n, i+1, s);    // For ASCII Value

        return;
    }
}