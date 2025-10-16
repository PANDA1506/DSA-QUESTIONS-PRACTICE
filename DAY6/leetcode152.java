class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int rightprod = 1;
        int leftprod = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++){

            leftprod = leftprod == 0 ? 1 :leftprod;
            rightprod = rightprod == 0 ? 1 :rightprod;

            leftprod *= nums[i];
            rightprod *= nums[n-1-i];

            ans = Math.max(ans, Math.max(leftprod, rightprod));
        }
        return ans;
    }
}
