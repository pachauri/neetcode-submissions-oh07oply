class Solution {
    public int maxProfit(int[] prices) {
        /**
        left = buy
        right = sell
        agar price kam mila → left update
        **/

        int left = 0;
        int result = 0;

        for(int right = 1;right<prices.length;right++){
            if(prices[left] > prices[right]){
                left = right;
            }
            result = Math.max(result,prices[right]-prices[left]);

        }

        return result;


        
    }
}
