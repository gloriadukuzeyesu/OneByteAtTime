class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length  > nums2.length) {
            return intersect (nums2, nums1); 
        }
        
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(); 
        for (int x : nums2) {
            int count = map.getOrDefault(x, 0); 
            if(count > 0) {
                list.add(x); 
                map.put( x, count - 1); 
            }
        }
        
        int[] res = new int[list.size()];
        int index = 0; 
        for(int x : list) {
            res[index++] = x; 
        }
        return res; 
    }
}