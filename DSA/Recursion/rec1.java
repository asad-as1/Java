import java.util.*;
public class rec1 {
    public static int [] find(int ans[], int i, int c) {
        if(i == ans.length) return new int[c];
        if(ans[i] == 2)  c++;
       
        int b[] = find(ans, i+1, c);
        if(ans[i] == 2) b[c-1] = i;
        return b;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,2,2};
        int b[] = find(a,0,0);
        System.out.println(Arrays.toString(b));
    }
}
