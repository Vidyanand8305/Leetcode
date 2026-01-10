public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // safer than (low+high)/2

            if (isBadVersion(mid)) {   // ✅ correct here
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
