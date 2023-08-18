public class Subset {
    
    public static void findSubset(String str, String newStr, int i){

        if(i == str.length()){
            if(newStr.length() == 0){

                System.out.println("null");
            }
            else{
                
                System.out.println(newStr);
            }
            return;
        }

        // yes
        findSubset(str, newStr+str.charAt(i), i+1);
        // no
        findSubset(str, newStr, i+1);
    }

    public static void main(String []args){

        String str = "abc";
        findSubset(str,"",0);
    }
}

// total subset  pow(2,n)
// 1 subset ko nikalne me n time lagta hai
// pow(2,n) subset nikalne me   O(pow(2,n) * n)