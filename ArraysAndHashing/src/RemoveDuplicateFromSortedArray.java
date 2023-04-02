//Qst Leetcode 26. Remove Duplicates from Sorted Array
public class RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int index = 1; // the first element will always be unique.
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }
        return index;
    }
}
