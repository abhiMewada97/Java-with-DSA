
import java.util.Scanner;

class type_Casting{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        // float num = 34.455f;
        int num2 = (int)num;
        System.out.println(num2);
    }
}