import java.util.*;

class Complex {

    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public static Complex sum(Complex c1, Complex c2){
        // return Complex s = new Complex((c1.real + c2.real), (c1.img + c2.img));
        return new Complex((c1.real + c2.real), (c1.img + c2.img));
    }

    public static Complex product(Complex c1, Complex c2){
        // return Complex p = new Complex((c1.real - c2.real), (c1.img - c2.img));
        return new Complex((c1.real - c2.real), (c1.img - c2.img));
    }

    public static Complex difference(Complex c1, Complex c2){
        // return Complex d = new Complex((c1.real * c2.real), (c1.img * c2.img));
        return new Complex((c1.real * c2.real), (c1.img * c2.img));
    }

    public void printComplex() {
        System.out.println(real + " + " + img + "i");
    }

}

public class Solution {
    public static void main(String[] args) {

        Complex c1 = new Complex(2, 4);
        Complex c2 = new Complex(3, 5);

        Complex e = Complex.sum(c1, c2);
        Complex f = Complex.product(c1, c2);
        Complex g = Complex.difference(c1, c2);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}