public class fibonacci {
    static int a=0, b=1, c=0;
    public static void fibo(int n)
    {
        if(n == 0) {
            return;
        }
        fibo(n-1);
        a=b;
        b=c;
        c=a+b;
        System.out.print(c+ " ");
    }
    public static void main(String[] args) {
        fibo(5);
    }
}
