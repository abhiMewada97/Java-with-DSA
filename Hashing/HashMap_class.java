import java.util.HashMap;
public class HashMap_class {

    public static void main(String []args){

        // HashMap<key_type, value_type> hm = new HashMap<>();
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("US", 100);
        hm.put("China", 1001);

        System.out.println(hm);
        // int population = hm.get("uk");
        int population = hm.get("US");
        System.out.println(population);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("Bhopal"));
        
        hm.put("Bhopal",44);
        System.out.println(hm.containsKey("Bhopal"));

        System.out.println(hm.remove("China"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}