import java.util.*;

public class Valid_parenthesis {

    public static boolean isValid(String pair) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < pair.length(); i++) {

            char ch = pair.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {

                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String pair = "({[]})";
        System.out.println(isValid(pair));
    }
}
