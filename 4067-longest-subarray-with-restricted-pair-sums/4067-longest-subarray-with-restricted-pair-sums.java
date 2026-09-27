import java.util.*;
class Solution {
    public int maxSubarray(int[] nums) {
        int n =nums.length;
        int left=0;
        int ans =1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right =0;right<n;right++){
            int x = nums[right];
            boolean valid =true;
            for(int a:map.keySet()){
                if(map.containsKey(a+x)){
                    valid = false;
                    break;
                }
                int b = x-a;

                if(map.containsKey(b)){
                    if(a!=b){
                        valid = false;
                        break;
                    }
                    if(map.get(a)>=2){
                        valid = false;
                        break;
                    }
                }
            }
            while(!valid){
                int remove = nums[left];
                map.put(remove , map.get(remove)-1);
                if(map.get(remove)==0){
                    map.remove(remove);
                }
                left++;
                valid =true;
                for(int a : map.keySet()){
                    if(map.containsKey(a+x)){
                        valid=false;
                        break;
                    }
                    int b =x-a;
                    if(map.containsKey(b)){
                        if(a!=b){
                            valid = false;
                            break;
                        }

                        if(map.get(a)>=2){
                            valid = false;
                            break;
                        }
                    }
                }
            }
                map.put(x,map.getOrDefault(x,0)+1);
            ans = Math.max(ans , right-left+1);
        }
        return ans;

        
    }
}