class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int[] arr = stack.stream().mapToInt(Integer::intValue).toArray();
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
