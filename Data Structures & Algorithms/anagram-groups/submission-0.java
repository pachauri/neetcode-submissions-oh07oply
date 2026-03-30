class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            String data = strs[i];
            int[] freq = new int[26];
            for(int j = 0;j<data.length();j++){
                freq[data.charAt(j)-'a']++;
            }
            String key = "";
            for(int num : freq){
                key = key + "#"+ num;
            }

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(data);
                map.put(key,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(data);
                map.put(key,list);
            }

        }

        return new ArrayList<>(map.values());
    


    }
}
