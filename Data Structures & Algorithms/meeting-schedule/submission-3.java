/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() == 0){
              return true;
        }
        Collections.sort(intervals, (a,b) -> a.start - b.start);
        Interval prev = intervals.get(0);
        for(int i = 1;i<intervals.size();i++){
            Interval current = intervals.get(i);
            if(current.start < prev.end){
                return false;
            }
            prev = current;

        }

        return true;

    }
}
