class MinStack {
    Stack<Integer> stack = new Stack<>(); 
    Stack<int[]> minTracker = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minTracker.isEmpty() || val < minTracker.peek()[0]) {
            minTracker.push(new int[]{val, 1}); 
        } else if(val == minTracker.peek()[0]) {
            minTracker.peek()[1]++;
        }
        
    }
    
    public void pop() {
        if(stack.peek() == minTracker.peek()[0]) {
            minTracker.peek()[1]--;
        }
        if(minTracker.peek()[1] == 0) {
            minTracker.pop();
        }
         stack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minTracker.peek()[0];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */