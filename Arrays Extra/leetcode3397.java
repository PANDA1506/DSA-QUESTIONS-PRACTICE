class Solution {
    public int maxDistinctElements(int[] nums, int k) {      
        Arrays.sort(nums);
        int nextAvailable = Integer.MIN_VALUE; 
        int count = 0;

        for (int num : nums) {
            int assigned = Math.max(nextAvailable, num - k);
            if (assigned <= num + k) { 
                count++;
                nextAvailable = assigned + 1; 
            }
        }
        return count;
    }
}
