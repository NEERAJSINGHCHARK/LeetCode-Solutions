class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int left1=0;
        int left2=0;

        int maxnum=0;

        while(left1<g.length && left2<s.length){
            if(s[left2]>=g[left1]){
                maxnum++;
                left2++;
                left1++;
            }else{
                left2++;
            }
        }
        return maxnum;
    }
}