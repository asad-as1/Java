// Best time to sell or buy I

public class Stock{
    public static void main(String args[])
    {
        int prices[] = {7,1,5,3,6,4};
        int buy = Integer.MAX_VALUE, profit = 0, max = 0;
        for(int i=0; i<prices.length; i++)
        {
            if(buy < prices[i])
            {
                profit = prices[i] - buy;
                max = Math.max(max, profit);
            }
            else
            buy = prices[i];
        }
        System.out.println("Maximum profit = " + max);
    }
}