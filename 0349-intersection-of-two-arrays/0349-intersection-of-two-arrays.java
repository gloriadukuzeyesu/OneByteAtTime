class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        // 1. loop over nums1 and put every element in a set
        //  3. create new array 
        // 2. loop over nums2 and use the set to find shared element, 
        // put into a new array
        
        
        HashSet<Integer>set = new HashSet<>(); 
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]); 
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                list.add(nums2[i]); 
                set.remove(nums2[i]);      
            }  
        }
        
        
        int[]res = new int[list.size()]; 
        // put things from set to new array
        for(int i = 0 ; i < list.size(); i++) {
            res[i] = list.get(i); 
        }
        
        
        return res;   
    }
}