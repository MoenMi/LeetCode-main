class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            } else {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
