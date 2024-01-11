import java.util.*;

public class Duplicate_parentheses {

    public static boolean isDuplicate(String pair) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < pair.length(); i++) {

            char ch = pair.charAt(i);
            if(ch==')'){
                int count =0;
                // while(s.peek() != '(' ){
                while(s.pop() != '(' ){
                    // s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                // else{
                //     s.pop();
                // }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String pair1 = "((a+b)+(c+d))";
        String pair2 = "(((a+b)+(c+d)))";
        System.out.println(isDuplicate(pair1));
    }
}
