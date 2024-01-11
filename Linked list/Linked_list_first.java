public class Linked_list_first {

    public static class Node {

        int data;
        Node next;  // obect of same class which store reference of other obj.

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String []args){

        // main method static hai eshliye eshke andar se hum sirf
        // static method ko hi call ker sakte hai

        Linked_list_first ll = new Linked_list_first();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
    }
}


//  Error...............