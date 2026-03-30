class Solution {
    public int[] productExceptSelf(int[] nums) {
        /**

        nums     = [1,2,4,6]
        leftArr  = [1,1,2,8]
        rightArr = [48,24,6,1]
        product = [48,24,12,8]

        **/

        int[] lArray = new int[nums.length];
        int[] rArray = new int[nums.length];
        lArray[0] = 1;
        rArray[nums.length-1] = 1;

        for(int left = 1;left<nums.length;left++){
            lArray[left] = lArray[left-1] * nums[left-1];
        }

        System.out.println(Arrays.toString(lArray));

        for(int right = nums.length-2;right>=0;right--){
            rArray[right] = rArray[right+1] * nums[right+1];
        }

        System.out.println(Arrays.toString(rArray));

        int[] product = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            product[i] = lArray[i] * rArray[i];

        }

        return product;
        
    }
}  
