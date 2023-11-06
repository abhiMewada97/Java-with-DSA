import java.util.*;

public class pair_sum_two_pointer_approach {

    public static void findSumPair( ArrayList<Integer> list, int pairSum) {

        int size = list.size();
        int i,j=0;
        while(list.get(j)<list.get(j+1)){
            j++;
        }
        i=j+1;
        // System.out.println(i);

        while(i!=j) {
            if(pairSum == list.get(i)+list.get(j)) {

                break;
            }
            else if(pairSum > list.get(i)+list.get(j)){

                i=(i+1)%size;
            }
            else {

                j=((size+j)-1)%size;
            }
        }
        if(pairSum == list.get(i)+list.get(j)){

            System.out.println("Found at "+i+" + "+j+" = "+list.get(i)+" "+list.get(j));
        }
        else {
            System.out.println("Not found ");
        }
    }
    
    public static void main(String []args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // sorted & rotate
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int pairSum=16;

        findSumPair(list,pairSum);
    }
}
