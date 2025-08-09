// Program to find the number of elements in Union of two arrays.
import java.util.*;
public class hashSet3
{
    public static int union(int a[],int b[])
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++)
        set.add(a[i]);
        for(int j=0;j<b.length;j++)
        set.add(b[j]);
        System.out.println("The Union of two arrays is:");
        System.out.println(set);
        System.out.print("The size of union is: ");
        return set.size();
    }
    public static void main(String args[])
    {
        int a[]={7,3,9};
        int b[]={6,3,9,2,9,4};
        System.out.println(union(a,b));
    }
}
