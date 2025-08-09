//                map
// 1. HashMap  in Random order 
// 2. TreeMap  in Sorted order(key)
// 2. LinkedHashMap  in Insertion order 

import java.util.*;
public class Map {
    public static void main(String[] args) {
        // TreeMap <Integer, Integer> map = new TreeMap<>();
        // map.put(1, 9);
        // map.put(-3, 18);
        // map.put(9, 2);
        // System.out.println(map);    // {-3=18, 1=9, 9=2}

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(2, 1);
        map.put(1, 2);
        map.put(0, 3); 
        System.out.println(map);
    }
}