import java.util.ArrayList;

public class Stack_link_list {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        static class Stack {
            static Node head = null;

            public static boolean isEmpty(){
                if(head == null){

                    return true;
                }
                return false;
            }

            // push
            public static void push(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            // pop
            public static void pop(){

                if(isEmpty()){
                    return;
                }
                head = head.next;;
            }

            // peek
            public static void peek(){

                if(isEmpty()){
                    return;
                }
                System.out.println(head.data);
            }
        }

    public static void main(String []args){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty()){
            s.peek();
            s.pop();
        }
    }
}