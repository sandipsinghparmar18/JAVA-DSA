import java.util.*;
public class Intervals {
    static int minRemoval(int intervals[][]) {
        // Sort intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removals = 0;
        int lastEnd = Integer.MIN_VALUE; // Keeps track of the end time of the last non-overlapping interval

        for (int[] interval : intervals) {
            if (interval[0] < lastEnd) {
                // Overlapping interval, increment removals
                removals++;
            } else {
                // Update lastEnd to the current interval's end time
                lastEnd = interval[1];
            }
        }
        return removals;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of intervals:");
        int n = sc.nextInt();
        
        int[][] intervals = new int[n][2];
        
        System.out.println("Enter the intervals (start and end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        
        // Call the minRemoval method
        int result = minRemoval(intervals);
        
        System.out.println("Minimum number of intervals to remove: " + result);
        
        sc.close();
    }
}
