package linkedlist;

class Node4 {
    int data;
    Node4 next;

    Node4(int x) {
        data = x;
        next=null;
    }
}
public class InsertAtAnyPosition {
    public static Node4 insertAtPos(Node4 head,int pos, int data)
    {
        Node4 temp = new Node4(data);
        if(head==null)
        {
         if(pos==1)
         {
             return temp;
         }
         else {
             return head;
         }
        }
        if(pos==1)
        {
            temp.next=head;
            return temp;
        }
        Node4 curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
            if (curr == null) {
                System.out.println("Position out of range");
                return head;
            }
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    public void traverse(Node4 temp)
    {
        Node4 curr =temp;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node4 head=new Node4(2);
        head.next = new Node4(5);
        head.next.next = new Node4(10);
        head.next.next.next= new Node4(30);
        head.next.next.next.next = new Node4(40);

        head = insertAtPos(head,4,20);

    }
}
