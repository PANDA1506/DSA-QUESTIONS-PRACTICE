
class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int res = 0;
        int preSum = 0;
        
        for(int i = 0; i < arr.length; ++i){
            preSum += arr[i];
            
            if (preSum == k)
                res = i + 1;

            
            if(map.containsKey(preSum - k))
                res = Math.max(res, i - map.get(preSum - k));
            
            
            if(!map.containsKey(preSum))
                map.put(preSum, i);
            
        }
         return res;
    }
   
}
