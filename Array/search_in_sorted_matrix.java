public class search_in_sorted_matrix {
    
    public static void find(int [][]matrix, int value) {

        int i=0,j=matrix[0].length-1; 
        
        // System.out.println(matrix[i][j]+" ");

        while(i<matrix.length && j >= 0) {

            if(matrix[i][j] == value) {
                System.out.println("found " +i+" "+j);
                return;
            }
            else if(value > matrix[i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
        System.out.println("not found");
    }

    public static void main(String []args) {
        int [][]matrix ={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 33;
        find(matrix,key);
    }
}
