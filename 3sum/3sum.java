class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; i++) {
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            } else{
                int l = i + 1; 
                int r = nums.length - 1; 
                while ( l < r) {
                    int sum = nums[l] + nums[r] + nums[i];
                    if(sum > 0 ) {
                        r--;
                    } else if (sum < 0) {
                        l++;
                    } else {
                        list.add( Arrays.asList(nums[l], nums[r] , nums[i]));
                        l++;
                        while ( l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                    }
                }
            }
        }
        return list;
    }
}