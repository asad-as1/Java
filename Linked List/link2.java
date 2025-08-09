import java.util.*;
class link2{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Asad");
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("Ansari");

        // Add Element at any index;
        list.add(2,"anss");

        System.out.println(list);
        System.out.println("The size of the list: "+list.size());

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("NULL");

        //list.removeFirst();
        //System.out.println(list);
        //list.removeLast();

        //Remove element of any index;
        list.remove(2);

        // Sorting a list;
        list.sort(null);
        System.out.println(list);

        // Set element at any index;
        list.set(1, "mr");
        System.out.println(list);

        list.stream();
        System.out.println(list);
    }
}