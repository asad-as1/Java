import java.util.*;
public class hashMap2
{
    public static void main(String args[])
    {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("India",120);
        map.put("Dubai",60);
        map.put("Arab",40);

        // for(int val:arr)   Method 1: It contains a key-value pair in the form of set;
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        // Method 2: It contains only set of strings(keys);
  /*    Set<String> keys = map.keySet();
        for(String key: keys)
        System.out.println(key+" "+map.get(key));  */

        // For deleting
        map.remove("India");
        System.out.println(map);
    }
}
