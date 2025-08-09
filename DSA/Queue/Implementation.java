// Queue is an interface while is  a class

public class Implementation {
    int q[];
    int f = 0;
    int r = -1;
    int size = 0;

    public Implementation() {
        this.q = new int[5];
    }

    public Implementation(int size) {
        this.q = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == q.length;
    }

    public void enqueue(int data) throws Exception {
        if (isFull()) {
            throw new Exception("Overflow");
        }
        r = (r + 1) % q.length;
        q[r] = data;
        size++;
    }

   
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        int data = q[f];
        q[f] = 0; 
        f = (f + 1) % q.length;
        size--;
        return data;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        return q[f];
    }

    public int rare() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        return q[r];
    }

    public int size() {
        return size;
    }

    public void display() {
        for(int i=f; i<=r; i++) System.out.print(q[i] + " ");
        System.out.println();;
    }

    public static void main(String[] args) throws Exception {
        Implemen queue = new Implemen
        queue.enqueue(8);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(4);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();

        // System.out.println(queue.rare());
        // System.out.println(queue.size());
    }
}
