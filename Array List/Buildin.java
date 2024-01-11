import java.util.ArrayList;
import java.util.List;

public class Buildin {

    // lambda duncrion -> sortForm of big func
    // in java, Comparator is an interface for sorting an object
    Arrays.sort(arr_name, Comparator.comparingDouble(o -> o[2]));
    
    Arrays.sort(coins, Collections.reverseOrder());
    Arrays.sort(coins, Comparator.reverseOrder());

    


    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    List<String>  myAlist = new ArrayList<String>();
    
        myAlist.add("Geeks");
        myAlist.add("Practice");
        myAlist.add("Quiz");
        System.out.println("Original ArrayList : " + myAlist);
        myAlist.remove("Quiz");

        arrlist1.addAll(arrlist2);

        arr.clear();
        arr.contains(value);
        arr.isEmpty();
        arr.indexOf(value);
        arr.get(2);

        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());

}
