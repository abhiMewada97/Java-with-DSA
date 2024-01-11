// Access_Modifiers.java is a package --> package is a group of related classes and interfaces 

class ABC {
    int x = 30;
}

public class Access_Modifiers {
    public static void main(String argvs[]) {
        ABC obj1 = new ABC();

        ABC obj2 = obj1;

        obj2.x = 6;
        System.out.println("The value of x is: " + obj1.x);
    }
}