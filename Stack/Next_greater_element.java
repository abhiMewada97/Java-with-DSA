import java.util.Stack;

public class Next_greater_element {
    
    public static void nextGreater(long []arr, int n) {
        Stack <Integer> s = new Stack<>();
        long nextGreater[] = new long[n];
        
        
        for(int i=n-1 ;i>=0; i--) {
            
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }
            
            s.push(i);
        }
        
        for(int i=0; i<nextGreater.length; i++) {
            System.out.print( nextGreater[i] +" ");
        }
    }

    public static void main(String []args) {
        long arr[] = {6, 8, 0, 1, 3};

        nextGreater(arr, arr.length);
    }
}


/*
 class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack <Long> s = new Stack<>();
        long nextGreater[] = new long[n];
        
        
        for(int i=n-1 ;i>=0; i--) {
            
            
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            
            long val = arr[i];
            
            if(s.isEmpty()) {
                arr[i] = -1;
            }
            else {
                // nextGreater[i] = arr[s.peek()];
                arr[i] = s.peek();
            }
            
            s.push(val);
        }
        
        return arr;
    }
}
 */