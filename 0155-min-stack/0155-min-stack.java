class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(long val) {
     if(st.isEmpty()){
        st.push(val);
        min=val;
     }
     else if(val > min){
      st.push(val);
     }
     else{
        st.push(2*val-min);
        min=val;
     }
    }

    public void pop() {
    if(st.isEmpty()){
        return;
    }
    else if (st.peek() > min){
        st.pop();
    }
    else{
        long x= st.peek();
        min= 2*min-x;
        st.pop();
    }
    }

    public long top() {
       
       
    if(st.peek() > min){
        long x = st.peek();
        return x;
    }
    else{
        
        return min;
    }
    }

    public long getMin() {
        return min;
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