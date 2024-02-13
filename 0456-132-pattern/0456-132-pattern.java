class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3) {
            return false; 
        }
        int[] minArray = new int[nums.length];
        
        minArray[0] = nums[0]; 
        
        for(int j = 1; j < nums.length; j++) {
            minArray[j] = Math.min(minArray[j - 1], nums[j]); 
        }
        Stack<Integer> stack = new Stack<>(); // to store the sorted sequence
        // traverse back ward to build a monostack 
        for(int j = nums.length - 1; j >= 0; j--) {
            // pop before pushing
            while(!stack.isEmpty() && stack.peek() < nums[j]) {
                // add a filter
                if(stack.peek() > minArray[j]) {
                    return true; 
                }
                // pop
                stack.pop(); 
                // we are sure that the stack is sorted in ascending order
                // nums[j] is always the smallest one. 
            }
            stack.push(nums[j]); 
        }
        
        return false; 
        // time complexity : O(n)
        // space complexity : O(n)
    }
}