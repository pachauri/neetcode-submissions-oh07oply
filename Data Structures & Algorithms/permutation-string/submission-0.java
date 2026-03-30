class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int left = 0;
        int windowSize = s1.length();

        Map<Character, Integer> map = new HashMap<>();

        // 👉 build map
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();

        for (int right = 0; right < s2.length(); right++) {

            char r = s2.charAt(right);

            // 👉 right add
            if (map.containsKey(r)) {
                map.put(r, map.get(r) - 1);
                if (map.get(r) == 0) {
                    count--;
                }
            }

            // 👉 maintain window size
            while ((right - left + 1) > windowSize) {
                char l = s2.charAt(left);

                if (map.containsKey(l)) {
                    if (map.get(l) == 0) {
                        count++;
                    }
                    map.put(l, map.get(l) + 1);
                }
                left++;
            }

            // 👉 check
            if (count == 0) return true;
        }

        return false;
    }
}