package linkedlist;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }

    public static void traverse(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
}
public class LinkedListImplementation {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Node.traverse(head);


    }

}
