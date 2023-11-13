public class Binary_String {

    public static void binaryPrint(int n, int lastEle, StringBuilder str) {

        if(n==0) {
            System.out.println(str);
            return;
        }

        binaryPrint(n-1, 0, str.append(0));

        str.deleteCharAt(str.length() - 1);
        
        if(lastEle==0){
            
            binaryPrint(n-1, 1, str.append(1));
            str.deleteCharAt(str.length() - 1);
        }
    }

    public static void main(String []args) {
        
        int n=3;
        binaryPrint(n,0,new StringBuilder(""));
        
    }    
}
