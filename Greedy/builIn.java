import java.util.*;
public class builIn {

    // lambda duncrion -> sortForm of big func
    // in java, Comparator is an interface for sorting an object
    Arrays.sort(arr_name, Comparator.comparingDouble(o -> o[2]));
    
    Arrays.sort(coins, Collections.reverseOrder());
    Arrays.sort(coins, Comparator.reverseOrder());
}
