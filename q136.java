class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        int i = 0, j = 1;
        boolean same = false;

        while (j <= nums.length - 1) {
            if (nums[i] != nums[j] && same == true) {
                i = j;
                same = false;
            } else if (nums[i] == nums[j]) {
                same = true;
            }

            j++;
        }

        return nums[i];
    }
}
