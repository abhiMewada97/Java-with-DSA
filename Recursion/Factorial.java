public class Factorial {
    
    public static int factorialNum(int num){
        if(num == 0){
            return 1;
        }
        return num*factorialNum(num-1);
    }

    public static void main(String []args){

        System.out.println(factorialNum(5));
    }
}
