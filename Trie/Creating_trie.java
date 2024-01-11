class Creating_trie {

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


    public static void main(String []args){

        Searching_trie s = new Searching_trie();

        String words [] = {"the", "a", "there", "their", "any", "three"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println("three present in trie -> "+s.search("three"));
        System.out.println("thor present in trie -> "+s.search("thor"));
        System.out.println("thr present in trie -> "+s.search("thr"));
    }
}