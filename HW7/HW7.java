package HW7;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        //not sure if this line of code is the correct step
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<Integer> endTime = new ArrayList<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            boolean assignedServer = false;

            for (int i = 0; i < endTime.size(); i++) {
                if (endTime.get(i) <= start) {
                    endTime.set(i, end);
                    assignedServer = true;
                    break;
                }
            }

            if (!assignedServer) {
                endTime.add(end);
            }

            endTime.sort(null);
        }

        return endTime.size();
    }
}
