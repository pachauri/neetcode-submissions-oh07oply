class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

       // min heap
       PriorityQueue<Integer> minHeap = new 
               PriorityQueue<>((a,b) -> frequencyMap.get(a) - frequencyMap.get(b));

       for(int num : frequencyMap.keySet()){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }

       }   

       int[] result = new int[k];
       int i = 0;
       while(!minHeap.isEmpty()){
          result[i++] = minHeap.poll();
       } 

       return result;      


       

    }
}
