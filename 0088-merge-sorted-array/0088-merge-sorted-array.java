class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0; 
        int prev = -1;
        int [] res = new int[m + n];
        int k = 0;
        while(i < m & j < n) {
            if(nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                 res[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while(i < m) {
            res[k] = nums1[i];
            k++;
            i++; 
        }
        while( j < n) {
            res[k] = nums2[j]; 
            k++;
            j++; 
        }
        
        for(int x = 0; x  < nums1.length; x ++) {
            nums1[x] = res[x]; 
        }
        
        
//         while ( i < m && j < n) {
//             if(nums1[i] <= nums2[j]) {
//                 int temp = nums1[i];
//                 nums1[i] = nums2[j];
//                 j++;
//                 i++;
//                 prev = temp; 
                
//             }
//         }
        
    }
    
    // pi
    // p2 
    
}