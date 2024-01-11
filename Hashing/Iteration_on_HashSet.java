import java.util.*;

public class Iteration_on_HashSet {
    
    public static void main(String []args){
        HashSet <String> cities = new HashSet<>();

        cities.add("Dehli");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //   OR

        for(String city : cities){
            System.out.println(city);
        }
    }
}
