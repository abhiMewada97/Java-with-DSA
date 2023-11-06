public class copy_constructor {

    public static void printMarks(Student st2){
        for(int i=0; i<3; i++){
            System.out.print(st2.marks[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String []args){

        Student st1 = new Student();
        
        st1.name = "Abhishek";
        st1.roll = 9752;
        st1.password = "abbhi9752shek";
        st1.marks[0] = 70;
        st1.marks[1] = 80;
        st1.marks[2] = 90;
        
        Student st2 = new Student(st1);
        
        printMarks(st2);

        st1.marks[2] = 100;
        st2.password = "9752shek";

        printMarks(st2);
    }
}

class Student{

    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
    }
    
    // shallow copy constructor......................changes effect
    // Student(Student st1){
        
    //     marks = new int[3];
    //     name = st1.name;        //both are correct
    //     // this.name = st1.name;
    //     this.roll = st1.roll;

    //     this.marks = st1.marks;  //pura array copy nahi hua balki uska reference copy hua hai
    // }

    // deep copy constructor......................changes not effect
    Student(Student st1){
        
        marks = new int[3];
        name = st1.name;
        this.roll = st1.roll;

        for(int i=0; i<marks.length; i++){
            this.marks[i] = st1.marks[i];
        }
    }
}