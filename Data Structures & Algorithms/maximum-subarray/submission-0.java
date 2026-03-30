class Solution {
    public int maxSubArray(int[] nums) {
        // nums = [2,-3,4,-2,2,1,-1,4]
        int maxSum = nums[0];
        int currSum = 0;
        for(int i =0;i<nums.length;i++){
            if (currSum < 0) {
                currSum = 0;
            }
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum,currSum);

        }

        return maxSum;
        
    }
}
