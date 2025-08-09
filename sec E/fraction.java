public class fraction{
    public static void main(String[] args) {
        int n1 = 4, n2 = 8;
        int d1 = 8, d2 = 16;
        int d3 = d1*d2;
        int n3 = (n1*d2) + (n2*d1);
        int min = Math.min(d3,n3);
        int hcf = 1;
        for(int i=min; i>=1; i--)
        {
            if(n3%i == 0 && d3%i == 0)
            {
                hcf = i;
                break;
            } 
        }
        System.out.println(n3/hcf + "/" + d3/hcf);
    }
}