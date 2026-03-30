class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                int freq = map.get(c);
                 map.put(c,freq+1);
            }else{
                map.put(c,1);
            }

        }

        for(Character c : t.toCharArray()){
        if(!map.containsKey(c) || map.get(c) == 0){
            return false;
        }else {
                 int freq = map.get(c);
                 map.put(c,freq-1);
        }
        }
        return true;

    }
}
