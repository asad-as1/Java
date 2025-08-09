public class Linked1 {

    class Node {
        int data;
        Node next;
    }

    int size;
    Node head;
    Node tail;

    public void addFirst(int val) {
        Node nn  = new Node();
        nn.data =  val;

        if(size == 0) {
           head = nn;
           tail = nn;
        //    nn.next = null;
        }
        else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int val) {
        
        if(size == 0) {
            addFirst(val);
        }
        else {
            Node nn = new Node();
            nn.data =  val;
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    public void addKth(int idx, int val) throws Exception{
        if(idx <= 0 || idx > size) {
            throw new Exception("Index not found");
        }
        
        Node temp = getKth(idx-1);
        Node nex = temp.next;
        Node nn = new Node();
        nn.data = val;
        temp.next = nn;
        nn.next = nex;
        size++;
    }

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        return tail.data;
    }

    public Node getKth(int k) throws Exception{
        if(k <= 0 || k > size) {
            throw new Exception("Index not found");
        }
        Node temp = head;
        while(k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public void removeFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return;
    }

    // public void removeLast() {
    //     // Node temp = getKth(size-1);
    //     temp.next = null;
    //     tail = temp;
    //     size--;
    // }

    public void removeKth(int k) throws Exception {
        if(k <= 0 || k > size) {
            throw new Exception("Index not found");
        }
        
        Node temp = getKth(k-1);
        Node temp1 = temp.next;
        temp.next = temp.next.next;
        temp1.next = null;
        size--;
    }
    
    public Node reverse(Node node) {
        if(node == null || node.next == null) return node;
        Node prev = null, curr = node;
        while(curr != null) {
            Node nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) throws Exception {
        Linked1 l = new Linked1();

        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);

        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);
        l.addLast(10);

        // l.addKth(3, -1);

        l.print();

        l.reverse(l.head);

        l.print();

        
        // System.out.println("First : "+l.getFirst());
        // System.out.println("Second : " + l.getLast());
        // System.out.println("Kth : " + l.getKth(3));

        // l.removeFirst();
        // l.removeLast();
        // l.removeKth(5);

        // l.print();

    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}