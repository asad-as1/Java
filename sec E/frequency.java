public class frequency{
    public static void fre(int[] n)
    {
        int pos = 0;
        int b[] = new int[n.length];

        for(int i=0; i<n.length; i++)
        {
            int flag = 1;
            for(int j=0; j<pos; j++)
            {                              
                if(n[i] == b[j]) 
                { 
                    flag = 0;
                    break;
                } 
            }
            if(flag == 1) b[pos++] = n[i];
        }

        for(int i:b)
        {
            int count = 0;
            for(int j: n)
            {
                if(i == j)
                count++;
            }
            if(count != 0)
            System.out.println(i +": " + count);
        }

    }
    public static void main(String[] args)
    {
        int num[] = {1,1,1,2,2,2,3,4,5,6,6,10,-10};
        fre(num);
    }
}