class NumArray {
    int[]sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        int currSum = 0;
        int i = 0;
        for(int num : nums) {
            currSum += num;
            sums[i] = currSum; 
            i++;
        } 
    }
    
    public int sumRange(int left, int right) {
        int sum = 0; 
        int leftS = 0; 
        if(left > 0) {
            leftS = sums[left - 1];
        } else {
            leftS = 0; 
            
        }
        int rightS = sums[right];
        return rightS - leftS;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */ 