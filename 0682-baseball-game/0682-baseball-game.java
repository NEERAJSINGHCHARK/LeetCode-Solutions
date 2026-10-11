class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st = new Stack<>();

       for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
            st.pop();
        }
        else if(operations[i].equals("D")){
            int last =st.peek();
            st.push(last*2);
        }
        else if(operations[i].equals("+")){
            int last = st.pop();
            int secondlast = st.peek();

            st.push(last);
            st.push(last+secondlast);
        }else{
            st.push(Integer.parseInt(operations[i]));
        }
       } 
       int total =0;

       while(!st.isEmpty()){
        total+=st.pop();
       }
       return total;
    }
}