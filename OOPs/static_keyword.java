public class static_keyword {

    public static void main(String []args){

        Student s1 = new Student();
        s1.schoolName = "Nutan School";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(Student.schoolName);  //static variable ko class bhi directly access ker sakty hai
        
        Student s3 = new Student();
        s3.schoolName = "Nutan Hr. Sec. School";

        System.out.println(s2.schoolName);
        System.out.println(Student.schoolName);
    }    
}

class Student{

    String name;
    int roll;
    static String schoolName;
}

//static ki help se multiple creation nahi hoti memory me 
//or same value ko use ker pate hai