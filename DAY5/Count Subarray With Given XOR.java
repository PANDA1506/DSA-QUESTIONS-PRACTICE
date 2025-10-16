class Solution {
    public long subarrayXor(int arr[], int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int xorr = 0;
        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            xorr = xorr ^ arr[i];
            
            if(map.get(xorr ^ k) != null)
                count += map.get(xorr ^ k);
                
            if(xorr == k){
                count++;
            }
          
            if (map.get(xorr) != null)
                map.put(xorr, map.get(xorr) + 1);
            else map.put(xorr,1);
            
        }
        return count;
    }
}
