class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[1]));

        int firststart = intervals[0][0];
        int lastend = intervals[0][1];
        int count =0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastend){
                count++;
            }else{
            lastend=intervals[i][1];
            }
        }
        return count;
    }
}