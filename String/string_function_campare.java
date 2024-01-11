public class string_function_campare {
    
    public static void main(String []args){
        String s1 = "Tony";     //new keyword, ka use nahi karenge to bah kisi purani string ko hi point ker rahi hoti hai
        String s2 = "Tony";     // s2 bhi s1 ki string ko hi point ker raha hai, eshliya s1 & s2 equal ho jate hai
        String s3 = new String("Tony");  //when we use new keyword to ek new string create hoti eshliya s1 & s3 equal nahi hote

        if(s1 == s2){
            System.out.println("s1 and s2 Equal ");
        }
        else{
            System.out.println("s1 and s2 Not Equal ");
        }

        if(s1 == s3){
            System.out.println("s1 and s3 Equal ");
        }
        else{
            System.out.println("s1 and s3 Not Equal ");
        }

        if(s1.equals(s3)){  //check value equal or not
            System.out.println("s1 and s3 Equal ");
        }
        else{
            System.out.println("s1 and s3 Not Equal ");
        }
    }    
}


//value ko equil check karne ke liye hum == use nahi ker sakte
// == check karta hai ki bo object level per same hai kya

//s1 s2 ke andar string ki value stor nahi hai, ye sirf heap me rakhi string, ko point ker rahe
// s1 s2 ko refrence variable keh sakte hai