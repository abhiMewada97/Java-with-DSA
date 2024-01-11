import java.util.ArrayList;

public class Stack_array_list {

        static class Stack {
            static ArrayList <Integer> list = new ArrayList<>();

            public static boolean isEmpty(){
                
                return list.size()==0;
            }

            // push
            public static void push(int data){
                list.add(data);
            }

            // pop
            public static void pop(){

                if(isEmpty()){
                    return;
                }
                list.remove(list.size()-1);
            }

            // peek
            public static void peek(){

                if(isEmpty()){
                    return;
                }
                System.out.println(list.get(list.size()-1));
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