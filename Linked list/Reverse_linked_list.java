public class Reverse_linked_list {
    
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addElement(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void reverseLinkedList(){

        Node prev = tail = head, curr = head.next, next=null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public void printLinkedList(){

        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String []args){

        Reverse_linked_list ll = new Reverse_linked_list();

        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(4);
        ll.addElement(5);
        ll.addElement(6);
        
        ll.printLinkedList();
        ll.reverseLinkedList();
        ll.printLinkedList();
    }
}
