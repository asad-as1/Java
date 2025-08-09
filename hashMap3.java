// Program to find out all the elements that appperas more than n/3 times.
import java.util.*;
public class hashMap3
{
    public static void majority(int nums[])
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);       // For update the frequency.
            else
            map.put(nums[i],1);
        }
        for(int Key:map.keySet())
        {
            if(map.get(Key)>(nums.length)/3)
            System.out.println(Key);
        }
    }
    public static void main(String args[])
    {
        int nums[]={1,3,2,5,13,1,5,1};
        majority(nums);
    }
}