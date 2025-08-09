public class comb {
    public static void main(String args[])
    {
        int nums[] = {1,2,3,4,5,6};
        for(int i=0; i< nums.length; i++)
        {
            int flag = 1;
            for(int j=i+1; j< nums.length; j++)
            {
               if(nums[i]<nums[j])
               {
                flag = 0;
                break;
               }
               
            }
            if(flag == 1)
            System.out.println(nums[i]);

        }
    }
}

