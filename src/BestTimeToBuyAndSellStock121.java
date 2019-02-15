public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int bestProfit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length -1; i++){
            if(buyPrice > prices[i]) buyPrice = prices[i];
            if(prices[i] - buyPrice > bestProfit){
                bestProfit = prices[i] - buyPrice;

            }

            }
        return bestProfit;
    }
}




//    public static int maxProfit(int[] prices) {
//        int bestProfit = 0;
//        for (int i = 0; i < prices.length; i++){
//            for (int y = i + 1; y < prices.length; y++){
//                if(prices[i] < prices[y] && prices[y] - prices[i] > bestProfit){
//                    bestProfit = prices[y] - prices[i];
//
//                }
//
//            }
//        }
//        return bestProfit;
//    }
//}

//    public static int maxProfit(int[] prices) {
//        int bestProfit = 0;
//        for (int i = 0; i < prices.length -1; i++){
//            for (int y = i + 1; y < prices.length; y++){
//                if(prices[y] - prices[i] > bestProfit){
//                    bestProfit = prices[y] - prices[i];
//
//                }
//
//            }
//        }
//        return bestProfit;
//    }
//}