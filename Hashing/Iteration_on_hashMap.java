import java.util.*;

public class Iteration_on_hashMap {

    public static void main(String []args){
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 23);
        hm.put("us", 54);
        hm.put("china", 77);

        //Iterate

        //hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Keys = "+ k +", Value = "+hm.get(k));
        }
    }
}
