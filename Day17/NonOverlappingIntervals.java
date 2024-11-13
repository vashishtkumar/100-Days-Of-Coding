public class NonOverlappingIntervals {
    leetcode = 434
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
           Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
           int cnt=1;
           int previndex=0;
    
           for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= intervals[previndex][1]){
                cnt++;
                previndex=i;
            }
           }
           return intervals.length-cnt;
        }
    }
}

tc=O(nlogn); sc=O(1);