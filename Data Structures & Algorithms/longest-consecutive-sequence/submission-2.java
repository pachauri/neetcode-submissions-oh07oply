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
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength,length);

            }

        }

        return maxLength;

    }
}
