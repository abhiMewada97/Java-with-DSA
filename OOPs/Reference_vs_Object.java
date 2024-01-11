public class Reference_vs_Object {

    public static void main(String[] args) {

        final int csa = 43;
        // csa = 23;        // error  -->  can not we changed
        System.out.print(csa);

        Vehicle v1 = new Vehicle();
        v1.v();                                 // only v work

        Vehicle v2 = new Car();
        // v2.c();                               // only v work

        Vehicle v3 = new Bike();
        // v3.b();                              // only v work


        // Car c1 = new Vehicle();              // error  ////////////;

        Car c2 = new Car();                      // only v,c work
        c2.v();
        c2.c();

        Car c3 = new Bike();                     // only v,c work
        c3.v();
        c3.c();


        // Bike b1 = new Vehicle();               // error //////////////
        // Bike b2 = new Car();

        Bike b3 = new Bike();
        b3.v();
        b3.c();
        b3.b();
    }
}

class Vehicle {
    public void v(){
        System.out.println("vehicle ");
    }
}

class Car extends Vehicle {
    public void c(){
        System.out.println("Car ");
    }
}

class Bike extends Car {
    void b(){
        System.out.println("Bike ");
    }
}



// class Base {
// 	public void Print()
// 	{
// 		System.out.println("Base");
// 	}
// }

// class Derived extends Base {
// 	public void Print()
// 	{
// 		System.out.println("Derived");
// 	}
// }

// class Reference_vs_Object {

// 	public static void DoPrint(Base o)
// 	{
// 		o.Print();
// 	}
// 	public static void main(String[] args)
// 	{
// 		Base x = new Base();
// 		Base y = new Derived();
// 		Derived z = new Derived();
//      Derived d =  new Base();        // error: incompatible types: Base cannot be converted to Derived
// 		DoPrint(x);
// 		DoPrint(y);
// 		DoPrint(z);
// 	}
// }
