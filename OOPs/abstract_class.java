public class abstract_class {
    
    public static void main(String []args){

        Horse h = new Horse();
        h.changeColor();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

    }
}

abstract class Animal{

    String color;

    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    void walk(){}
}

class Horse extends Animal{

    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
        System.out.println(color);
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs");
        System.out.println(color);
    }
}