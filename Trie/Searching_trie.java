public class Searching_trie extends Creating_trie {
// public class Searching_trie {

    public boolean search(String key){  // O(L)

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
}
