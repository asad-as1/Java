// Merge Sort on Linked List

public class MergeSort {

    class Node {
        int data;
        Node next;
        
        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void add(int val) {
        Node node = new Node(val);

        if(head == null) {
            head = node;
            tail = head;
            head.next = null;
            return;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
       
        while(left != null && right != null) {
            if(left.data <= right.data) {
                temp.next = left;
                left = left.next;  
            }
            else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if(left != null) temp.next = left;
        if(right != null) temp.next = right;
            
        return mergedLL.next;
    }

    public  Node merge(Node head) {
        if(head == null || head.next == null) return head;

        Node mid = findMiddle(head);
        Node rigthHead = mid.next;
        mid.next = null;     // remember

        Node newLeft = merge(head);
        Node newRight = merge(rigthHead);
 
        return mergeSort(newLeft, newRight);
    }

    public static void print(Node head2) {
        while(head2 != null) {
            System.out.print(head2.data + " ");
            head2 = head2.next;
        }
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println("Linked List Before sorting");
        print(list.head);

        System.out.println("\n" + "Linked List After sorting");
        Node head2 = list.merge(list.head);
        print(head2);
    }
}
