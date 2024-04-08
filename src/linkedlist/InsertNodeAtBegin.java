package linkedlist;

class Node2
{
    int data;
     Node2 next;

     Node2(int x)
     {
         data=x;
         next=null;
     }

}

 class insertNodeAtBegin {
    public static Node2 insertBegin(Node2 head , int x)
    {
        Node2 temp = new Node2(x);
        temp.next=head;
        return temp;
    }
    public static void traverse(Node2 head)
    {
        Node2 curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node2 head = null;
        head = insertBegin(head,30);
        head = insertBegin(head,20);
        head = insertBegin(head,10);
        head = insertBegin(head,5);
        traverse(head);

    }
}
