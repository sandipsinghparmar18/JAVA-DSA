class Node{
    int data;
    Node next;
    Node prev;
    Node(int val){
        this.data=val;
        this.next=null;
        this.prev=null;
    }
}
public class LinkedList {
    public void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.next;
        }
        System.out.println();
    }
    public Node sortBiotonicDLL(Node head){
        if(head==null || head.next==null) return head;
        Node curr=head;
        while(curr.next!=null && curr.data<curr.next.data){
            curr=curr.next;
        }
        //if all list are in assending order
        if(curr.next==null) return head;
        Node secont=curr.next;
        secont.prev=null;
        curr.next=null;

        secont=reverse(secont);
        return merge(head,secont);
    }
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while (curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node merge(Node first,Node second){
        if(first==null) return second;
        if(second==null) return first;
        if(first.data<second.data){
            first.next=merge(first.next, second);
            first.next.prev=first;
            first.prev=null;
            return first;
        }else{
            second.next=merge(first, second.next);
            second.next.prev=second;
            second.prev=null;
            return second;
        }
    }
    public static void main(String[] args) {
        LinkedList solution = new LinkedList();

        // Example input 1: 2 <-> 5 <-> 7 <-> 12 <-> 10 <-> 6 <-> 4 <-> 1
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.prev = head;
        head.next.next = new Node(7);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(12);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        head.next.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;

        System.out.print("Original List: ");
        solution.printList(head);

        head = solution.sortBiotonicDLL(head);
        System.out.print("Sorted List: ");
        solution.printList(head);
    }
}
