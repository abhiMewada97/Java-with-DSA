public class super_keyword {

    public static void main(String[] args) {

        Colore c = new Colore();
    }

}

class Animal {
    Animal(){
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    Cat(){
        System.out.println("Cat");
    }
}

class Colore extends Cat {
    Colore(){
        super();
        System.out.println("Red");
    }
}