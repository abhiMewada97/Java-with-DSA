public class Detect_and_remove_cycle {
    
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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                removeCycle(fast);
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(Node fast){
        Node slow = head;
        Node prev = null;

        while(fast != slow){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String []args){

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        //1 -> 2 -> 3 -> 4 -> 1     // wrong
        //1 -> 2 -> 3 -> 4 -> 2     // right
        System.out.println(isCycle());
        System.out.println(isCycle());
        
    }
}
