import java.lang.Math;

public class shortest_path {

    public static float shortestPath(String path){

        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
            else if(path.charAt(i) == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String []args){

        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
    
}
