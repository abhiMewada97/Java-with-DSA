import java.util.*;

public class Reuse {
    public static void main(String []args) {

        String str = "    ahbishek  mewada is     present      ";
        
        String []s = str.split("\\s+");
        
        System.out.print("s");
        for (String string : s) {
            System.out.print(string +" ");
        }
    }
}