class Solution {
    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        for (int i = 0; i < n; i++) {
            if (a[i] > b[0]) {
                // Swap the elements
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // Place b[0] (which is now possibly larger) in correct position in b[]
                int first = b[0];
                int j = 1;
                while (j < m && b[j] < first) {
                    b[j - 1] = b[j];
                    j++;
                }
                b[j - 1] = first;
            }
        }
    }
}
