class RecentCounter {
    int arr[];
    int rear;
    int front;

    public RecentCounter() {
        arr= new int[10000];
        rear=0;
        front=0;
        
    }
    
    public int ping(int t) {
        arr[rear]=t;
        rear++;

        while(front<rear && arr[front]<t-3000){
            front++;
        }
        return rear-front;
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */