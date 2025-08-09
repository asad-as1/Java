// Print Elements only one time.

public class unique {

    public static int[] Unique(int a[])
    {
        int pos = 0;
        int b[] = new int[a.length];

        for(int i=0; i<a.length; i++)
        {
            int flag = 1;
            for(int j=0; j<pos; j++)
            {                              
                if(a[i] == b[j]) 
                { 
                    flag = 0;
                    break;
                } 
            }
            if(flag == 1) b[pos++] = a[i];
        }
        a = new int[pos];           // new int krne se nyi array bnegi jo a se alg hogi.
        for(int i=0; i<pos; i++)
        a[i] = b[i];

        return a;
    }
    public static void main(String args[])
    {
        int a[] = {0,1,2,2,2,0,3,3,4,5,5};
        a = Unique(a);
        for(int i=0; i<a.length;i++)
        System.out.print(a[i]+" ");      // 0 1 2 3 4 5 
    }
}
