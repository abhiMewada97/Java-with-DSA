public class Palindrome {

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

    public Node checkMid() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public int checkPalindrome() {
        if (head == null || head.next == null) {
            return 1;
        }

        // find mid
        Node mid = checkMid();

        // reverse 2nd half
        Node prev = null, curr = mid, next;
        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;

        // check left half & right half
        while (rightHead != null) {
            if (leftHead.data != rightHead.data) {
                return -1;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return 1;
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
        Palindrome ll = new Palindrome();

        // ll.addLast(1); // not palindrome
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);

        // ll.addLast(1); // palindrome
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        ll.addLast(1); // palindrome
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLinkedList();
        System.out.println(ll.checkPalindrome());
        ll.printLinkedList();
    }
}