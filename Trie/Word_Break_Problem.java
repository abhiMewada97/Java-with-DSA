public class Word_Break_Problem {
    
    static class Node {
        Node children[] = new Node[26];
        boolean endOfWord;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word) {  // O(L)  L=word.length

        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx]==null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        
        curr.endOfWord = true;
    }

    public static boolean search(String key){  // O(L)

        Node curr = root;

        for(int level=0; level<key.length(); level++) {

            int idx = key.charAt(level) - 'a';
            
            if(curr.children[idx]==null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endOfWord == true;
    }

    public static boolean wordBreak(String key) {

        if(key.length()==0) {
            return true;
        }

        for (int i = 0; i <= key.length(); i++) {
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String []args){

        String words [] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        String key = "ilikesamsamsungsamice";

        System.out.println(wordBreak(key));

    }
}