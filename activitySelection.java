import java.util.*;
public class activitySelection {
     public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};
        int n = start.length;

        // Create a list of activity indexes
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        // Sort the indexes based on end times
        Arrays.sort(indexes, Comparator.comparingInt(i -> end[i]));

        System.out.println("Selected activities:");
        int lastEnd = -1;
        for (int i : indexes) {
            if (start[i] >= lastEnd) {
                System.out.println("Start: " + start[i] + ", End: " + end[i]);
                lastEnd = end[i];
            }
        }
    }
}

