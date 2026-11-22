class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] merged = new int[n+1][2];
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int i=0;
        int count = 0;
        while(i<n && intervals[i][1]<newInterval[0]){
            merged[i] = intervals[i];
            i++;
            count++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        merged[count] = newInterval;
        count++;
        while(i<n){
            merged[count] = intervals[i];
            count++;
            i++;
        }
        return Arrays.copyOf(merged,count);


    }
}
