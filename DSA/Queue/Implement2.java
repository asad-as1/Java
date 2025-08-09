// Queue implementation using two stacks

import java.util.*;
public class Implement2 {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public void enqueue(int data){
        main.push(data);
    }

    public int dequeue() throws Exception {

        if(main.isEmpty()) throw new Exception("Queue is Empty");

        while(main.size() > 1) {
            temp.push(main.pop());
        }
        int data = main.pop();
        while(temp.size() > 0) {
            main.push(temp.pop());
        }

        return data;
    }

    public int front() throws Exception {

        if(main.isEmpty()) throw new Exception("Queue is Empty");

        while(main.size() > 1) {
            temp.push(main.pop());
        }
        int data = main.peek();
        while(temp.size() > 0) {
            main.push(temp.pop());
        }

        return data;
    }
    
    public void display() throws Exception {

        if(main.isEmpty()) throw new Exception("Queue is Empty");

        while(main.size() > 0) {
            temp.push(main.pop());
        }

        while(temp.size() > 0) {
            System.out.print(temp.peek() + " ");
            main.push(temp.pop());
        }
        System.out.println();

    }

    public int rare() {
        return main.peek();
    }

    public int size() {
        return main.size();
    }

    public static void main(String[] args) throws Exception {
        Implement2 queue = new Implement2();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        queue.display();

        // queue.dequeue();
        // queue.dequeue();

        // queue.display();

        // System.out.println(queue.size());
        // System.out.println(queue.front());
        // System.out.println(queue.rare());
    }

}
