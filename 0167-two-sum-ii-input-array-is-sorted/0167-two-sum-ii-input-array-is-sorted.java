class Solution {
    public int[] twoSum(int[] numbers, int target) {
      // two pointers
      int i = 0; 
      int j = numbers.length - 1; 
      while (i <j ) {
        int sum = numbers[i] + numbers[j]; 
        if(sum == target) {
          return new int[]{i+1, j + 1}; 
        } else if(sum < target) { 
          // when sum is less that target icrement i++ bcz array is sorted
          i++; 
        } else {
          j--; 
        }
      }
      return null;     
    }
}