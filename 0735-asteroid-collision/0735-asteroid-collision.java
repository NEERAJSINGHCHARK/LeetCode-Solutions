class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();

        for(int a:asteroids){
            while(a<0 && !st.isEmpty() && st.peek()>0 && st.peek()<-a){
                st.pop();
            }
            if(a<0 &&!st.isEmpty() && st.peek()==-a){
                st.pop();
            }
            else if(a>0|| st.isEmpty() || st.peek()<0){
                st.push(a);
            }else if(st.peek()>-a){
                continue;
            }
        }
        int[] ans = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }
        return ans;
    }
}