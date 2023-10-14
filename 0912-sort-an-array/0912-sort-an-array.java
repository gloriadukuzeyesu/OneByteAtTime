class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums,n); 
        return nums;
    }
    public void mergeSort(int[] nums, int n) {
        if(n == 1){
            return;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for(int i = 0; i < mid; i++){
            l[i] = nums[i];
        }
        for(int i = mid; i < n; i++) {
            r[i - mid] = nums[i];
        }
        mergeSort(l,mid);
        mergeSort(r,n-mid);
        
        merge(nums,l,r,mid,n-mid);
    }
    public void merge(int[]nums, int[] l, int[]r, int left, int rigth) {
        int i = 0, lp = 0 , rp = 0;
        
        while(lp < left && rp < rigth) {
            if(l[lp] <= r[rp]) {
                nums[i++] = l[lp++];
            }else {
                nums[i++] = r[rp++];
            }
        }
        
        while(lp < left) {
            nums[i++] = l[lp++];
        } 
        while(rp < rigth) {
            nums[i++] = r[rp++];
        } 
    }
}