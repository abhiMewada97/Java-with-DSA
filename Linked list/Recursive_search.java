public class Recursive_search {
    
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

    public int recursiveSearch(int key, int index, Node temp){

        if(temp == null){
            return -1;
        }
        if(temp.data == key){
            return index;
        }
        return recursiveSearch(key, index+1, temp.next);
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

        Recursive_search ll = new Recursive_search();

        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(4);
        ll.addElement(5);
        ll.addElement(6);
        
        ll.printLinkedList();

        System.out.println(ll.recursiveSearch(5,0,head));
    }
}
