public class Interface {
    
    public static void main(String []args){

        Animal a = new Animal();
        a.carnivoreFun();
        a.harbivoreFun();
    }
}

interface Carnivore {
    void carnivoreFun();
}

interface Harbivore {
    void harbivoreFun();
}



class Animal implements Carnivore, Harbivore {
    
    public void carnivoreFun(){
        System.out.println("I am Carnivore");
    }
    public void harbivoreFun(){
        System.out.println("I am Harbivore");
    }
}