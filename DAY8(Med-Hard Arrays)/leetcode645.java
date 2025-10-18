class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        int actualSum = 0;
        int n = nums.length;

        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num; 
            }
            set.add(num);
            actualSum += num;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (actualSum - duplicate);

        return new int[]{duplicate, missing};
    }
}

