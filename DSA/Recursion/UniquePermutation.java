// import java.util.*;


public class UniquePermutation {
    public static void main(String[] args) {

        // List<String> list = new ArrayList<>();
        // find("aba", "", list);
        // System.out.println(list);

        find("aba", "");
    }

    //  Method 1
    // public static void find(String s, String ans, List<String> list) {
    //    
    //     if(s.length() == 0) {
    //         if(!list.contains(ans)) list.add(ans);
    //     }
    //     for(int i=0; i<s.length(); i++) {
    //         find(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i), list);

    //     }
    // }


    // Method 2
    public static void find(String s, String ans) {

        if(s.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for(int i=0; i<s.length(); i++) {
            boolean b = false;
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    b = true;
                    break;
                }
            }
            if(b == false)
            find(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i));
        }
    }
}
