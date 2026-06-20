import java.util.*;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> a[1] - b[1]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[2] - b[2]   // earlier drop first
        );

        int currentPassengers = 0;

        // Step 3: Process each trip
        for (int[] trip : trips) {

            int passengers = trip[0];
            int start = trip[1];
            int end = trip[2];

            // Remove all completed trips (passengers get down)
            while (!pq.isEmpty() && pq.peek()[2] <= start) {
                currentPassengers -= pq.poll()[0];
            }

            // Add current passengers
            currentPassengers += passengers;

            // Check capacity
            if (currentPassengers > capacity) {
                return false;
            }

            // Add trip to heap
            pq.offer(trip);
        }

        return true;
    }
}