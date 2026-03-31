class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[0][0];

        }
        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
        int currentEnd = intervals[0][1];
        int currentStart = intervals[0][0];
        List<int[]> result = new ArrayList<>();
        for(int j = 1;j<intervals.length;j++){
            int nextStart = intervals[j][0]; 
            int nextEnd = intervals[j][1]; 
            if(currentEnd >= nextStart){
                currentEnd = Math.max(currentEnd, nextEnd);
            }else{
                result.add(new int[]{currentStart,currentEnd});
                currentEnd = nextEnd;
                currentStart = nextStart;
            }
            

        }
        result.add(new int[]{currentStart, currentEnd});

        return result.toArray(new int[result.size()][]); 

        
    }
}
