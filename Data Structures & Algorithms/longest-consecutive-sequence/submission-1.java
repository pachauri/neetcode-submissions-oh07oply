class Solution {
    public int longestConsecutive(int[] nums) {
        // 2,20,4,10,3,5 => duplicate avoid -> HashSet
        // 2 + 1 = 3
        // 3 +1 = 4
        // 4 + 1= 5 
        // 5 + 1 = 6 NO => count + 1 => length

        // 20 +1 
        // 4 + 1 = 5
        // 5 + 1 = 6 

        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        } 

        int maxLength = 0;

        for(int num : nums){
            int count = 0;
            if(set.contains(num)){
                while(set.contains(num)){
                    num += 1;
                    count++;
                }
                maxLength = Math.max(maxLength,count);

            }

        }

        return maxLength;

    }
}
