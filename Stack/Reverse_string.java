import java.util.*;

public class Reverse_string {
    
    public static String reverseString(String str){
        Stack <Character> s =  new Stack<>();

        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            char ch = s.pop();
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String []args){

        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
