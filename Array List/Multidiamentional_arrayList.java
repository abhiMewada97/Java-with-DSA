import java.util.*;

public class Multidiamentional_arrayList {
    public static void main(String []args){

        // ArrayList <ArrayList> mainList = new ArrayList<>();
        
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList <Integer> list1 = new ArrayList<>();
        // list1.add(2);
        // list1.add(5);
        // mainList.add(list1);

        // ArrayList <Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(6);
        // mainList.add(list2);
        
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        list2.remove(2);
        list2.remove(3);

        System.out.println(mainList);

        for(int i=0; i<mainList.size(); i++){
            ArrayList <Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }    
}
