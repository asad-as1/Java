//Program to reverse a stack.

import java.util.*;
public class stack5 {
    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        return;
        int top = s.pop();
        reverse(s);
        add(top,s);
    }
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
        s.push(4);
        reverse(s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
