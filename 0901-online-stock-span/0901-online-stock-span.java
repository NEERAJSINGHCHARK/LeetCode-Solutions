class StockSpanner {
Stack<int[]> s = new Stack<>();
int index=-1;
    
    public int next(int price) {
        index++;

        while(!s.isEmpty()&& s.peek()[1]<=price){
            s.pop();
        }
        int span;

        if(s.isEmpty()){
            span=index+1;
        }else{
            span = index-s.peek()[0];
        }
        s.push(new int[]{index, price});

        return span;
    }
}

 