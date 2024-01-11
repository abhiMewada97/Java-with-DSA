import java.util.*;

public class Activity_selection_by_sorting {
    
    public static void main(String []args){
        int start[] = {1,3,5,8,0,5};
        int end[] =   {2,4,7,9,6,9};

        // Sorting 
        int activities [][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda duncrion -> sortForm of big func
        // in java, Comparator is an interface for sorting an object
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1; i<end.length; i++){
            if(lastEnd <= activities[i][1]){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        // for(int i=0; i<activities.length; i++){
        //     System.out.println(activities[i][2]+" "+activities[i][1]);
        // }
        System.out.println("Max Activity "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ ans.get(i)+" ");
        }
    }
}
