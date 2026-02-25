class Solution {
    public int search(int[] nums, int target) {
        return modified(nums, target, 0, nums.length - 1);
    }
    private int modified(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
     int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[left] <= arr[mid]) {

            if (arr[left] <= target && target < arr[mid]) {
                return modified(arr, target, left, mid - 1);
            } else {
                return modified(arr, target, mid + 1, right);
            }
        }
        else {
            if (arr[mid] < target && target <= arr[right]) {
                return modified(arr, target, mid + 1, right);
            } else {
                return modified(arr, target, left, mid - 1);
            }
        }
    }
}