public class LargestRectangle {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,2,3};
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        int ans = 0;

        for(int i=0; i<a.length; i++) {
            left[i] = leftmin(i, a);
            right[i] = rightmin(i, a);
            ans = Math.max(ans, (right[i] - left[i] -1) * a[i]);
        }
        System.out.println(ans);
    }

    private static int leftmin(int i, int[] a) {
        int k = i - 1;
        while(k >= 0) {
            if(a[k] < a[i]) return k;
            k--;
        }
        return -1;
    }
    private static int rightmin(int i, int[] a) {
        int k = i + 1;
        while(k < a.length) {
            if(a[k] < a[i]) return k;
            k++;
        }
        return a.length;
    }
}