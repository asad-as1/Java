public class prefix_sum{

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=1; i<numbers.length; i++)
        {
            for(int j=i; j<numbers.length; j++)
            {
                currSum = prefix[j] - prefix[i-1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String args[])
    {
        int nums[] = {1,-2,6,-1,3};
        maxSubarraySum(nums);
    }
}