public class decimal {
    public static void main(String[] args) {
        String a = "1010";
        int ans = 0;
        for(int i=0; i< a.length() ; i++)
        {
         ans *= 2;
         String s = "" + a.charAt(i);
         ans += Integer.parseInt(s);
        }
        System.out.println("Decimal = " + ans);
     }
}
