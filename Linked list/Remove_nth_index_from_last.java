public class Remove_nth_index_from_last {
    
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

    public void removeFromLast(int index){

        int size=0;
        int i=1;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        if(index == size){
            head = head.next;
            return;
        }

        temp = head;
        while(i < size-index){
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
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

        Remove_nth_index_from_last ll = new Remove_nth_index_from_last();

        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(4);
        ll.addElement(5);
        ll.addElement(6);
        
        ll.printLinkedList();
        ll.removeFromLast(4);
        ll.printLinkedList();
    }
}
