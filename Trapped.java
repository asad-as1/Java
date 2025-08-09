// Calculate Trapped Rainwater
public class Trapped{
    public static void main(String args[])
    {
        int nums[] = {4,2,0,6,3,2,5};
        int n = nums.length, l = nums[0], r = nums[n-1], ans = 0;
        int [] left = new int[n], right = new int[n];
        for(int i=0; i<n; i++)
        {
            left[i] = Math.max(nums[i], l);
            l = left[i];
            right[n-i-1] = Math.max(nums[n-i-1], r);
            r = right[n-i-1];
        }

        for(int i=0; i<n; i++)
        {
            ans += Math.min(left[i], right[i]) - nums[i];
        }
        System.out.println("Trapped Rainwater is : " + ans); 
    }
} 