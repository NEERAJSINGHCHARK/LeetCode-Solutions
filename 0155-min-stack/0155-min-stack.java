import java.util.*;
class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();

    
    
    public void push(int value) {
        st.push(value);

        if(minst.isEmpty()){
            minst.push(value);
        }else{
            minst.push(Math.min(value, minst.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();
        
    }
    
    public int top() {
       return  st.peek();
        
    }
    
    public int getMin() {
       return minst.peek();
    }
}

