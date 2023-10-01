class NumArray {
    int[] array;
    
    public NumArray(int[] nums) {
        array = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        while(left <= right) {
            sum += array[left];
            left++;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */