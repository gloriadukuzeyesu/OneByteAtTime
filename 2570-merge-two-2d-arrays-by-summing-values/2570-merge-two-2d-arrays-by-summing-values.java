class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> list = new ArrayList<>(); 
        int num1Size = nums1.length; 
        int num2Size = nums2.length; 
        int i = 0; 
        int j = 0; 
        
        while ( i < num1Size && j < num2Size) {
            List<Integer> subList = new ArrayList<>(); 
            if( nums1[i][0] == nums2[j][0]) {
                subList.add(nums1[i][0]); 
                int sum = nums1[i][1] + nums2[j][1];
                subList.add(sum); //[1,6]
                list.add(subList);
                i++;
                j++; 
            } else if(nums1[i][0] < nums2[j][0]) {
                subList.add(nums1[i][0]); // [2,3]
                subList.add(nums1[i][1]);
                list.add(subList);
                i++; 
            } else {
                subList.add(nums2[j][0]);
                subList.add(nums2[j][1]); 
                list.add(subList);
                j++; 
            }
        }
        
        while (i < num1Size) {
            List<Integer> subList = new ArrayList<>();
            subList.add(nums1[i][0]);
            subList.add(nums1[i][1]);
            list.add(subList); 
            i++; 
        }
        
        while (j < num2Size) {
            List<Integer> subList = new ArrayList<>();
            subList.add(nums2[j][0]);
            subList.add(nums2[j][1]);
            list.add(subList); 
            j++; 
        }
        
        // convert list to array 
        int[][] array = new int[list.size()][list.get(0).size()]; 
        // [[1,6],[2,3],[3,2],[4,6]]
        for(int r = 0; r < list.size(); r++) {
            for(int c = 0; c < list.get(0).size(); c++) {
                array[r][c] = list.get(r).get(c); 
            }
        }
        return array; 
    }
}