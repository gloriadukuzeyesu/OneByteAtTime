class Solution {
       public int calculateSum(int[]arr, int mid) {
        int sum = 0; 
        for(int num : arr) {
            if(num > mid) {
                sum += mid; 
            } else{
                sum += num; 
            }
        }
        return sum;
    }
    
    public int findBestValue(int[] arr, int target) {
        int l = 0;
        int r = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            r = Math.max(r, arr[i]);
        }
        while(l <= r) {
            int mid = l + ((r - l) / 2);
            int sum = calculateSum(arr, mid);
            if(sum < target) {
                l = mid + 1; 
            } else{
                r = mid - 1;
            }
        }
        int first = calculateSum(arr,l);
        int second = calculateSum(arr,l-1);

        if(Math.abs(first - target) < Math.abs(second - target)) {
            return l;
        }
        return l - 1;
    }
 
}