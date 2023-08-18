class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        // Fill the min-heap with the first k elements from the array
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        
        // For the rest of the elements in the array, compare with the smallest element in the heap
        // If the current element is larger than the smallest element in the heap, replace it
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        // The kth largest element will be the smallest element in the min-heap
        return minHeap.peek(); 
    }
}