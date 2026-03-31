class Solution {
    public int jump(int[] nums) {
        // nums=[2,4,1,1,1,1]
        // 0 -> maxEnd = 2, end = 2, far = 2
        // 1 -> maxEnd = 5, end = 2, far = 5
        // 2 -> maxEnd = 4, end = 5
        // 3 -> maxEnd = 4

        int jumps = 0;
        int rangeEnd = 0;
        int maxReach = 0;

        for(int i = 0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach,i+nums[i]);
            // check range 
            if(i == rangeEnd){
                rangeEnd = maxReach;
                jumps++;
            }

        }

        return jumps;

        
    }
}
