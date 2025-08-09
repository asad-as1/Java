// Program to find the numbers of elements in Intersection of two arrays.
import java.util.*;
public class hashSet2
{
    public static int intersection(int a[],int b[])
    {
        int count=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<a.length;i++)
        set.add(a[i]);
        for(int j=0;j<b.length;j++)
        {
            if(set.contains(b[j]))
            {
            count++;
            System.out.println(b[j]+" ");
            set.remove(b[j]);
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int a[]={7,3,9};
        int b[]={6,3,9,2,9,4};
        System.out.println("The numbers of elements of Intersection is: "+intersection(a,b));
    }
}
