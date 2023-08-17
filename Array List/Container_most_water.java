import java.util.*;

public class Container_most_water {

    public static int storWater(ArrayList <Integer> height){

        // brute force  O(n^2)
        int maxWater =0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int currHeight = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currWater = currHeight * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String []args) {

        ArrayList <Integer> height = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storWater(height));
    }
}