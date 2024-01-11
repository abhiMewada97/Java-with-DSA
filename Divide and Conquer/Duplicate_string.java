public class Duplicate_string {

    public static void removeDuplicate(String str,int index, StringBuilder newStr, boolean map[]){

        if(str.length() <= index){

            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        if(map[str.charAt(index) -'a'] == true){
            removeDuplicate(str, index+1, newStr, map);
        }
        else{
            map[currChar -'a'] = true;
            removeDuplicate(str, index+1, newStr.append(currChar), map);
        }
    }

    public static void main(String []args){
        String str = "anpacollege";
        System.out.println(str);
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}