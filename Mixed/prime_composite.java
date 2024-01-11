
import java.util.Scanner;

class prime_composite{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number ");
        n = sc.nextInt();

        if (n==2) {
            System.out.println("Prime");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i <= Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Prime");
            }
            else{
                System.out.println("not Prime");
            }
        }
    }
}