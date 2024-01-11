import java.util.*;

public class Fractional_knapsack {
    
    public static void main(String []args){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx;
        // 1st col => ratio;

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }
            else{
                // include fractional item
                finalVal += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("final value is "+ finalVal);
    }
    
    // public static void main(String []args) {
    //     int val[] = {60,100,120};
    //     int weight[] = {10,20,30};

    //     float knapsack[][] = new float[3][3];
    //     int w = 500;

    //     for (int i = 0; i < knapsack.length; i++) {
    //         knapsack[i][0] = (val[i])/weight[i];
    //         knapsack[i][1] = val[i];
    //         knapsack[i][2] = weight[i];
    //     }

    //     Arrays.sort(knapsack, Comparator.comparingDouble(o->o[0]));

    //     // for (int i = 0; i < knapsack.length; i++) {
    //     //     System.out.println(knapsack[i][0]+" "+knapsack[i][1]+" "+knapsack[i][2]);
    //     // }

    //     int i=knapsack.length-1,sum=0;
    //     while(w>0 && i>=0) {
    //         if(knapsack[i][2]<w){
    //             w-=knapsack[i][2];
    //             sum+=knapsack[i][1];
    //         }
    //         else {
    //             sum+=w*knapsack[i][0];
    //             w=0;
    //         }
    //         i--;
    //     }
    //     System.out.println(sum);
    // }
}
