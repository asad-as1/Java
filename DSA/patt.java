public class patt {
    public static void main(String[] args) {
        int i=0, n = 5;
        for(i=0; i<10; i++) {
            if(i < n) {
                for(int j=0; j<=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            if(i > n) {
               for(int k=2*n; k>=i+1; k--) {
                System.out.print("* ");
               }
               System.out.println();
            }

        }
        
    }
}