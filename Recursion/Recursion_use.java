public class Recursion_use{

    public static void printReverse(int value){
        if(value <= 0){
            return;
        }

        printReverse(value-1);
        System.out.print(value+" ");
    }

    public static void main(String []args){

        printReverse(10);
    }
}