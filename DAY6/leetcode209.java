class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int currsum = 0;

        int high = 0, low = 0;

        while(high < nums.length){
            currsum += nums[high];
            high++;

            while(currsum >= target){
                int currwind = high - low;
                minlen = Math.min(currwind, minlen);

                currsum -= nums[low];
                low++;
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
