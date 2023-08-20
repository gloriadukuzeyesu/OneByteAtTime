class Solution {
    public int[] productExceptSelf(int[] nums) {
            // pref [i - 1]
        int [] pref = new int[nums.length];
        int[] suf = new int[nums.length];
        pref[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] * nums[i - 1];
        }
        suf[nums.length-1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * nums[ i + 1];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = pref[i] * suf[i];
        }

        return nums;
    
    }
}