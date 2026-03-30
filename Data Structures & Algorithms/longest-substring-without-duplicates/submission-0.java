class Solution {
    public int lengthOfLongestSubstring(String s) {
        /** Sliding window pattern 
         Template : 
           expand -> condition -> shrink
        **/
        Set<Character> set = new HashSet<Character>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0;right<s.length();right++){
            Character ch = s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,(right-left+1));
            
        }
        return maxLength;
    }
}
