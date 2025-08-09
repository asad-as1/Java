public class Implement {
    int[] st;
    int tos = -1;

    public Implement() {
        this.st = new int[5];
    }

    public Implement(int size) {
        this.st = new int[size];
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public boolean isFull() {
        return tos == st.length - 1;
    }

    public void push(int data) throws Exception {
        if (isFull()) {
            throw new Exception("Overflow");
        }
        st[++tos] = data;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        return st[tos];
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        int data = st[tos];
        st[tos--] = 0;
        return data;
    }

    public int size() throws Exception {
        if (isEmpty()) {
            throw new Exception("Underflow");
        }
        return tos+1;
    }

    public static void main(String[] args) throws Exception {
        Implement s = new Implement(7);
        
            s.push(8);
            s.push(7);
            s.push(6);
            s.push(5);
            s.push(4);
            // s.peek();
            // System.out.println(s.peek());
            System.out.println(s.size());
       
    }
}
