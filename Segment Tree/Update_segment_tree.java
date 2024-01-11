public class Update_segment_tree {
    
    public static int tree[];

    public static void init(int n) {
        tree = new int[4*n];
    }

    public static void buildST(int arr[], int i, int start, int end) {
        if(start == end) {
            tree[i] = arr[start];
            return;
        }

        int mid = (start+end)/2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2, mid+1, end);
        tree[i] = tree[2*i+1]+tree[2*i+2];
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {

        if(idx > sj || idx < si) {
            return;
        }

        tree[i] += diff;

        if(si != sj) { // non-leaf
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff); // left
            updateUtil(2*i+2, mid+1, sj, idx, diff); //right
        }
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        
        if(qj <= si || qi >= sj) { // non overlapping
            return 0;
        }
        else if(si>=qi && sj<=qj) { // complete overlap
            return tree[i];
        }
        else { // partial overlap
            int mid = (si+sj)/2; 
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int arr[], int qi, int qj) {

        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

    public static void update(int arr[], int idx, int newValue){
        
        int n = arr.length;
        int diff = arr[idx] - newValue;
        arr[idx] = newValue;

        updateUtil(0, 0, n-1, idx, diff);
    }
    
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        init(n);
        buildST(arr, 0, 0, n-1);

        for (int i = 0; i < (n*4); i++) {
            System.out.print(tree[i]+" ");
        }

        System.out.print("\n "+ getSum(arr,2,5));
        update(arr, 2, 2);
        System.out.println("\n "+ getSum(arr,2,5));

        for (int i = 0; i < (n*4); i++) {
            System.out.print(tree[i]+" ");
        }
    }
}
