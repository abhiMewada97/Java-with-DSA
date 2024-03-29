public class Prefix_Problem {

    static class Node {
        Node children[] = new Node[26];
        boolean endOfWord = false;
        int freq=1;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word) {

        Node curr = root;
        // System.out.println(curr.freq++);
        for (int i = 0; i < word.length(); i++) {
            
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null) {
                curr.children[idx] = new Node();
            }
            else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static void findPrefix(Node root, String ans) {

        // if(root == null) {
        //     return;
        // }

        if(root.freq == 1) {
            System.out.println(ans);
            return;
        }
        
        for (int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    
    public static void main(String []args) {

        String words [] = {"zebra", "dog", "duck", "dove"};
        
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        // System.out.println(root.freq);
        // System.out.println(root.freq++);
        // System.out.println(root.freq);
        // System.out.println(rootr.freq);

        root.freq = -1;

        findPrefix(root, "");
    }
}
