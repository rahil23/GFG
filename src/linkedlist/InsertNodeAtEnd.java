package linkedlist;

class Node3
{
    int data;
    Node3 next;

    Node3(int x)
    {
        data=x;
        next=null;
    }
}

public class InsertNodeAtEnd {

    public static Node3 insertEnd(int x,Node3 head)
    {
        Node3 temp = new Node3(x);
        if(head==null)
        {
            return temp;
        }
        Node3 curr = head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static void traverse(Node3 head)
    {
        Node3 curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {

        Node3 head=null;
head = insertEnd(10,head);
head = insertEnd(20,head);
head = insertEnd(30,head);
head = insertEnd(40,head);
traverse(head);

    }
}
