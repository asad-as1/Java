// Maximum subarray sum (Kadane's Algorithm)

public class Kadanes
{
    public static void main(String args[])
    {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i : nums)
        {
            currSum += i;
            maxSum = Math.max(currSum, maxSum);  
            if(currSum < 0) currSum = 0;
        }  
        System.out.println();
        System.out.println("Maximum subarray sum is : " + maxSum);
        System.out.println();
    }
}