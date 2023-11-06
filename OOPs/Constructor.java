public class Constructor {
    
    public static void main(String []args){

        Student st = new Student("Abhishek");
        System.out.println(st.name);
    }
}

class Student{

    String name;
    int age;

    Student(String name){

        // name = name;   // null
        this.name = name;
    }
}