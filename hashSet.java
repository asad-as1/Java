import java.util.HashSet;
public class hashSet
{
    public static void main(String args[])
    {
        // Creating
        HashSet<Integer> set =new HashSet<>();

        // Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Printng set
        System.out.println(set); 

        // Search - contains
        if(set.contains(1))
        System.out.println("Set contains");
        if(!set.contains(11))
        System.out.println("Does not contains");
        
        // Delete
        set.remove(3);
        if(!set.contains(3))
        System.out.println("It does not contains");

        // Size
        System.out.println("Size of the set is : "+set.size());
    }
}