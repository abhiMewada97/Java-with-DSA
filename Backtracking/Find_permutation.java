public class Find_permutation {

    public static void findPermutation(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        // recurtion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            //abc = "a" + "c" = ac
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }

    }

    public static void main(String []args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
