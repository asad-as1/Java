// Program to push an element at the bottom of the stack.
import java.util.*;
public class stack4{
    public static void add(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        add(data,s);
        s.push(top);
    }

    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        add(4,s);
        while(!s.isEmpty())
        {
            //System.out.println(s.peek());
            System.out.println(s.pop());
        }
    }
}