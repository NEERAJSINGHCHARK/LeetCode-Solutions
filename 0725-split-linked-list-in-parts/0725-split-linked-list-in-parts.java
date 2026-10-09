class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0;
        ListNode curr = head;

        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int size = n/k;
        int extra = n%k;

        ListNode Result[] = new ListNode[k];
        curr = head;

        for(int i=0;i<k;i++){
            Result[i]=curr;

            int partsize = size;
            if(i<extra){
                partsize++;
            }

            for(int j=0;j<partsize -1;j++){
                curr=curr.next;
            }

            if(curr!=null){
                ListNode nextpart =curr.next;
                curr.next=null;
                curr=nextpart;
            }
        }
        return Result;
        
    }
}