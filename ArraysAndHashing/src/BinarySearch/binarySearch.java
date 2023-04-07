package BinarySearch;

public class binarySearch {
    public int search(int[] nums, int target) {
        int left = 0; // left pointer
        int right = nums.length - 1; // right pointer
        while (left <= right) {
            int mid = left + (right - left) / 2; // divide the array into half
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1; // search left side
            } else {
                left = mid + 1; // search right side otherwise.
            }
        }
        return -1; // -1 if the target is not found in the array
    }
}
