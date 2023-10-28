class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>(); 
        int[] res = new int[temperatures.length]; 
        
        for(int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i]; 
            while(!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int j = stack.pop();
                res[j] = i - j; 
            }
            stack.push(i);
        }
       return res;
    }
}