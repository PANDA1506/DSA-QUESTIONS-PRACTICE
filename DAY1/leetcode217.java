// LEETCODE 217


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>();

        for(int num : nums){
            if (sets.contains(num))
                return true;
            sets.add(num);
        }
       return false;
    }
}
