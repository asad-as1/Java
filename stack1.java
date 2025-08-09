// Implementation of Stack by using Linkedlist.

public class stack1{

static class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
} 
    static class Stack{
    public static Node head;

    public static boolean isempty()
    {
        return head == null;
    }

    public static void push(int data)
    {
        Node newnode = new Node(data);
        if(isempty()){
        head = newnode;
        return;
        }
        newnode.next = head;
        head = newnode;

    }
    public static int pop()
    {
        if(isempty()) return -1;
        int top = head.data; 
        head = head.next;
        return top;
    }
    public static void peek(){
        Node curr = head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println("The Stack elements are: ");
        s.peek(); 
        System.out.println();

        while(!s.isempty())
        {
           System.out.print("Deleted element is : ");
           System.out.println (s.pop());;
        }
        s.peek();
    }
}