class link1{
    private int size;
    link1()
    {
        this.size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;

        Node( String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void add(String data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void last(String data)
    {
        Node newNode=new Node (data);
        if(head==null)
        head=newNode;

        Node curr = head;
        while(curr.next!=null)
        curr=curr.next;
        
        curr.next=newNode;
    }

    public void delete(){
        if(head==null)
        {
           System.out.print("List is empty");
           return;
        }
        size--;
        head=head.next;
    }
    public void del()
    {
        if(head==null)
        {
           System.out.print("List is empty");
           return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
        }
        Node sl = head;
        Node l = head.next;

        while(l.next != null)
        {
            sl=sl.next;
            l=l.next;
        }
        sl.next=null;
    }

    public void print()
    {
        if(head==null)
        System.out.println("The list is empty");

        Node curr = head;
        while(curr!=null)
        {
            System.out.print(" "+curr.data+" ");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
    public int getSize()
    {
        return size;
    }
    public void reverse()
    {
        if(head==null || head.next==null)
        return ;
        Node prev = head;
        Node curr = head.next;
        while(curr!=null)
        {
            Node nex = curr.next;
            curr.next = prev;
            prev=curr;
            curr=nex;
        }
        head.next=null;
        head=prev;
    }
    public Node recursive(Node head)
    {
        if(head == null || head.next == null)
        return head;
        Node newHead = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String args[]){
        link1 list = new link1();
        list.add("Asad");
        list.add("I am");
        list.last("Ansari");
        list.print();
        list.head = list.recursive(list.head);
        list.print();
       // System.out.println(" "+list.getSize());
       // list.delete();
       // list.print();
       // System.out.println(" "+list.getSize());
       // list.del();
       // list.print();
       // System.out.println(" "+list.getSize());
    }
}