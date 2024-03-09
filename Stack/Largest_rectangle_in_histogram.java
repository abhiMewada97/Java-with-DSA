import java.util.Stack;

public class Largest_rectangle_in_histogram {
    
    public static int largestRectangleArea(int[] heights) {
        int size = heights.length;

        if(size==1) return heights[0];

        int maxRect = 0;

        int nsl[] = new int[size];
        int nsr[] = new int[size];

        // Next smaller left
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<size; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i]=-1;
            }
            else {
                nsl[i]=s.peek();
            }
            s.add(i);
        }

        // Next smaller right
        s = new Stack<>();

        for(int i=size-1; i>=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i]=size;
            }
            else {
                nsr[i]=s.peek();
            }
            s.add(i);
        }

        // Current Area : width = j-i-1 = nsr[i]-nsl[j]-1
        int maxArea=0;
        for(int i=0; i<size; i++) {

            int currH = heights[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = currH*width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String []args) {
        int[] heights = {2,1,5,6,2,3};
        int ans = largestRectangleArea( heights);

        System.out.println("Largest Rectangle in Histogram "+ ans);
    }
}
