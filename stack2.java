import java.util.*;
  public class stack2{
    static class stack
    {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isempty()
        {
            return list.size() == 0;
        }

        public static void push(int val)
        {
            list.add(val);
        }
        public static void pop()
        {
            while(!isempty()) 
            {
                int b = list.get(list.size()-1);
                System.out.println(b);
                list.remove(list.size()-1);
            } 
        }
        public static void peek()
        {
            while(!isempty()) 
            {
                int b = list.get(list.size()-1);
                System.out.println(b);
            } 
        }
    }
    
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.peek();
        s.pop();
    }
}