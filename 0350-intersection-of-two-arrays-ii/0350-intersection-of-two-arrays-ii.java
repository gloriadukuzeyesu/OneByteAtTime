class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // space O(n)
        
        for( int i=0; i<nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        int k =0;
        
        for( int num : nums2) {
            int occurence = map.getOrDefault(num, 0);
            if(occurence > 0) {
                nums1[k] = num;
                k++;
                map.put(num, occurence-1);   
            }
        }
        
        
        return Arrays.copyOfRange( nums1, 0, k);
    }
}