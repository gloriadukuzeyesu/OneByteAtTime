class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length  > nums2.length) {
            intersect(nums2,nums1); 
        }
        HashMap<Integer, Integer> map  = new HashMap<>(); 
        for(int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1); 
        }
        List<Integer> list = new ArrayList<>(); 
        for (int y : nums2) {
            int count = map.getOrDefault(y,0);
            if(count > 0) {
                list.add(y);
                map.put(y,count - 1); 
            }
        }
        
        int index = 0; 
        int []res = new int[list.size()];
        for(int z : list) {
            res[index++] = z; 
        }
        return res; 
    }
}