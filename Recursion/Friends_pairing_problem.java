class Friends_pairing_problem {

    public static int friendsPair(int num) {
        
        if(num==1 || num==2) {
            return num;
        }
        // choice
        // single 
        int fnm1 = friendsPair(num-1);

        // pair
        int fnm2 = friendsPair(num-2);
        int pairWays = fnm2*(num-1);

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void main(String []args) {
        int num = 3;
        System.out.println(friendsPair(num));
    }
}