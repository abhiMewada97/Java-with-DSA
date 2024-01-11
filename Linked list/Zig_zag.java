public class Zig_zag {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void zigZag(){

        Node slow = head;
        Node fast = head.next;

        // mid
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // 2nd half reverse
        Node prev=null;
        Node curr=mid.next;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // zig zag merge
        while(left != null && right != null ){
            nextL = left.next ;     //
            left.next = right;      //
            nextR = right.next;     //
            right.next = nextL;     // zig zag merge

            left = nextL;       //
            right = nextR;      // update
        }
    }    

    public void printLinkedList() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Zig_zag ll = new Zig_zag();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addLast(5);

        ll.printLinkedList();
        ll.zigZag();
        ll.printLinkedList();
    }
}