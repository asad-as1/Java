public class primeall {
    public static void main(String[] args) {
        int n = 50, j = 2;
        while(j <= n) {
            int flag = 0;
            for(int i=2; i*i<=j; i++) {
               if(j%i == 0) {
                flag = 1;
                break;
               }
            }
            if(flag == 0)
            System.out.print(j + " ");
            j++;
       }  
    }
}
