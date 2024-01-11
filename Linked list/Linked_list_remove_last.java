public class Linked_list_remove_last {

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

    public void removeLast(){

        if(head == null){
            System.out.println("linked list empty ");
            return;
        }
        else if(head.next == null){
            head = tail = null;
            return;
        }
        Node prev = head;
        while(prev.next.next != null){
            prev = prev.next;
        }
        prev.next = null;        
    }

    public void addElement(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList(){

        if(head == null){
            System.out.println("No element to print ");
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
        Linked_list_remove_last ll = new Linked_list_remove_last();

        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(4);
        ll.addElement(5);
        ll.addElement(6);
        
        ll.printLinkedList();
        ll.removeLast();
        ll.printLinkedList();
    }    
}
