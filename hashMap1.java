import java.util.*;
public class hashMap1
{
    public static void main(String args[])
    {
        // Country(Key) , Population(value)
        HashMap<String,Integer> map= new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("Dubai",60);
        map.put("Arab",40);

        System.out.println(map);

        //Update if the key is exits/ or not exits.
        map.put("Arab",65);
        System.out.println(map);
        map.put("Mecca",40);
        System.out.println(map);

        // Search 
        if(map.containsKey("China"))
        System.out.println("Key is present in the map");
        else
        System.out.println("Key is not present in the map");

        // For getting the values of the keys
        System.out.println(map.get("China"));     // Key doesnt exit
        System.out.println(map.get("Arab"));      // Key Exits
    }
}
