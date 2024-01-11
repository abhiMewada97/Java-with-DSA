public class Linked_list_add_middle {

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
    public static int size=0;

    public void addMiddle(int data, int index){

        Node newNode = new Node(data);
        if(index==0) {
            addElement(data);
            return;
        }

        int i=0;
        Node temp = head;
        Node prev = null;
        while(index > i && temp != null) {

            prev = temp;
            temp = temp.next;
            i++;
        }
        if(i != index){
            System.out.println(index+" index not exit, " +data +" value can not insert");
            return;
        }
        newNode.next = temp;
        prev.next = newNode;
        size++;
    }

    public void addElement(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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
        Linked_list_add_middle ll = new Linked_list_add_middle();

        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(4);
        
        ll.printLinkedList();
        System.out.println("size is "+size);
        
        ll.addMiddle(5,4);
        ll.printLinkedList();
        ll.addMiddle(8,8);
        System.out.println("size is "+size);
    }
}