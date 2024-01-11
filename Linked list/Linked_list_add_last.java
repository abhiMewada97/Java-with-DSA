public class Linked_list_add_last {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Node temp = head;
        // while(temp.next != null){
        //     temp = temp.next;
        // }
        // temp.next = tail = newNode;

        tail.next = newNode;
        tail = newNode;     //1
        // tail = tail.next;   //2    1 & 2 both are same
    }

    public void printLinkedList(){

        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String []args){
        Linked_list_add_last ll = new Linked_list_add_last();

        ll.addLast(1);
        ll.printLinkedList();
        ll.addLast(2);
        ll.printLinkedList();
        ll.addLast(3);
        ll.printLinkedList();
        ll.addLast(4);

        ll.printLinkedList();
    }
}
