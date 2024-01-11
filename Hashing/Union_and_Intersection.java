import java.util.*;

public class Union_and_Intersection {
    
    public static void main(String []args){

        int arr1[] = {7,3,9,3};
        int arr2[] = {6,3,11,2,3,9,4};

        
        // Union 
        HashSet <Integer> union = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }

        System.out.println("Union is "+ union);

        // Intersection
        HashSet <Integer> intersection = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){
            intersection.add(arr1[i]);
        }

        int count=0;
        System.out.print("Intersection is ");
        for(int i=0;i<arr2.length;i++){
            if(intersection.contains(arr2[i])){
                count++;
                System.out.print(" "+arr2[i]);
                intersection.remove(arr2[i]);
            }
        }

    }
}
