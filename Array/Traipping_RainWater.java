import java.util.*;

public class Traipping_RainWater {

    public static int trappedRainWater(int []height){

        int size = height.length;
        
        // left max
        int leftHeight[] = new int[size];
        leftHeight[0] = height[0];

        for(int i=1; i < size; i++){
            leftHeight[i] = Math.max(leftHeight[i-1], height[i]);
        }
        
        // right max
        int rightHeight[] = new int[size];
        rightHeight[size-1] = height[size-1];

        for(int i=size-2; i >= 0; i--){
            rightHeight[i] = Math.max(rightHeight[i+1], height[i]);
        }

        int trappedWater = 0;
        for(int i=0; i < size; i++){
            trappedWater += (Math.min(leftHeight[i], rightHeight[i]) - height[i]);
            // System.out.println(sum+" ");
        }
        return trappedWater;
    }
    
    public static void main(String []args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}