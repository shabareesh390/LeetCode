class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> m=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        s.push(value);
        if(m.isEmpty() || value<=m.peek()){
            m.push(value);
        }
    }
    
    public void pop() {
        int top=s.pop();
        if(top == m.peek()){
            m.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */