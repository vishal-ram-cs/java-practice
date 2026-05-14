import java.util.*;

public class MergeIntervalsOptimized {
    public static int[][] merge1(int[][] intervals) {
        // Step 1: Sort intervals by their start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Use ArrayList to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Loop through all intervals
        for (int[] interval : intervals) {
            // If merged is empty OR no overlap with last interval, add it directly
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // There is overlap → merge the current interval with the last one
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], interval[1]);  // Update the end time
            }
        }

        // Step 4: Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Create a result array with max possible size
        int[][] result = new int[intervals.length][2];
        int index = 0;  // Keeps track of how many merged intervals we've added

        // Step 3: Loop through the intervals and merge them
        for (int i = 0; i < intervals.length; i++) {
            // If this is the first interval, just add it
            if (index == 0) {
                result[index] = intervals[i];
                index++;
            } else {
                // Get the last interval we added
                int[] last = result[index - 1];

                // Check for overlap
                if (intervals[i][0] <= last[1]) {
                    // Merge: update the end time
                    last[1] = Math.max(last[1], intervals[i][1]);
                } else {
                    // No overlap: add the current interval
                    result[index] = intervals[i];
                    index++;
                }
            }
        }

        // Step 4: Copy only the merged part of the result
        int[][] merged = new int[index][2];
        for (int i = 0; i < index; i++) {
            merged[i] = result[i];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }


    }


