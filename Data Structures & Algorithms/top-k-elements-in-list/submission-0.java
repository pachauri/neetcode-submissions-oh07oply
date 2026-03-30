class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Bucket Sort -> Frequency array
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq+1);
            }else{
                map.put(nums[i],1);
            }
        }

// 1-1,2-2,3-3,7-2
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key : map.keySet()){
            Integer value = map.get(key);
            if(bucket[value] == null){
                List<Integer> list = new ArrayList<>();
                list.add(key);
                bucket[value] = list;
            }else{
                List<Integer> list = bucket[value];
                list.add(key);
            }


        }

int[] result = new int[k];
int j = 0;
        for(int i =bucket.length-1;i>=0 && j < k;i--){
            if(bucket[i]==null){
                continue;
            }else{
                for(int num : bucket[i]){
result[j] = num;
j++;
if(k == j){
    break;
}
                }

            }

        }

        return result;

    }
}
