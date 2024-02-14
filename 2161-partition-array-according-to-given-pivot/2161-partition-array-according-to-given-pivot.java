class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessthanPivot = new ArrayList<>(); 
        List<Integer> greaterthanPivot = new ArrayList<>(); 
        List<Integer> equalstoPivot = new ArrayList<>(); 
        int index = 0; 
        
        for(int num : nums) {
            if(num > pivot) {
                greaterthanPivot.add(num); 
            } else if(num < pivot) {
                lessthanPivot.add(num);
            } else{
                equalstoPivot.add(num); 
            }
        }
        if(!lessthanPivot.isEmpty()){
            for(int i = 0; i < lessthanPivot.size(); i++) {
            nums[index++] = lessthanPivot.get(i); 
            }
        }
        
        if(!equalstoPivot.isEmpty()) {
            for(int i = 0; i < equalstoPivot.size(); i++) {
                 nums[index++] = equalstoPivot.get(i); 
            }
        }
        if(!greaterthanPivot.isEmpty()) {
             for(int i = 0; i < greaterthanPivot.size(); i++) {
                nums[index++] = greaterthanPivot.get(i); 
            }
        }
        return nums;   
    }
}