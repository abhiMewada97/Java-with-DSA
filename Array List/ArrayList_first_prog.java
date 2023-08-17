import java.util.ArrayList;

public class ArrayList_first_prog {

    public static void main(String []args) {

        ArrayList <Integer> list = new ArrayList<>();  //  <> which type data want to store
        // ArrayList <Boolean> list2 = new ArrayList<>();
        // ArrayList <String> List3 = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(25);
        list.add(98);
        list.add(8);

        System.out.println(list);
        
        int element = list.get(2);
        System.out.println(element);
        
        list.remove(3);
        System.out.println(list);
        
        list.set(1,45);
        System.out.println(list);

        list.add(1,5);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        System.out.println(list.contains(4));
        System.out.println(list.contains(8));


        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}


// java collection framwork