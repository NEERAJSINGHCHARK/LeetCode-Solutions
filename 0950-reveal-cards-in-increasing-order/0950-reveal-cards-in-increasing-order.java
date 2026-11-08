class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Queue<Integer>  q = new LinkedList<>();

        int n = deck.length;

        for(int i=0;i<n ;i++){
            q.add(i);
        }

        int ans[]= new int[n];

        for(int i=0;i<n;i++){
            int index =q.remove();

            ans[index]= deck[i];

            if(!q.isEmpty()){
                q.add(q.remove());
            }
        }
        return ans;
    }
}