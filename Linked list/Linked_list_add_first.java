public class Linked_list_add_first {
    
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){

        // step 1   create node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step 2   newNode next = head
        newNode.next = head;
        // step 3   head = newNode
        head = newNode;
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
        Linked_list_add_first ll = new Linked_list_add_first();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addFirst(2);
        ll.printLinkedList();
        ll.addFirst(3);
        ll.printLinkedList();
        ll.addFirst(4);

        ll.printLinkedList();
    }
}
