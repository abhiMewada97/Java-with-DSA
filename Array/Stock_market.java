public class Stock_market{

    public static void buyAndSell(int price[]){
        // int buyPrice = Integer.MAX_VALUE;
        // int profit, maxPro =0, sellingPrice;

        // int n=price.length;

        // for(int i=0; i<=n-2; i++){
        //     sellingPrice = price[i+1];

        //     if(buyPrice > price[i]){
        //         buyPrice = price[i];
        //     }

        //     profit = sellingPrice - buyPrice;
           
        //     maxPro = Math.max(maxPro,profit);
        // }
        // System.out.println(maxPro);


        int buyPrice = Integer.MAX_VALUE;
        int profit, maxPro =0;
        int n=price.length;

        for(int i=0; i<=n-1; i++){

            if(buyPrice < price[i]){  //profit
                profit = price[i] - buyPrice;
                maxPro = Math.max(maxPro,profit);
                
            } else {
                buyPrice = price[i];
            }
        }
        System.out.println(maxPro);
    }

    public static void main(String [] args){

        int price[] = {7,1,5,3,6,4};

        buyAndSell(price);
    }
}