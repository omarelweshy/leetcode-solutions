// https://leetcode.com/problems/search-insert-position

class Solution {
    public int searchInsert(int[] nums, int target) {
    int l = 0; int r = nums.length -1; int index = 0;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (nums[m] == target)
        return m;
      if (nums[m] > target) {
          index = m;
          r = m - 1;
      }
      else if (nums[m] < target) {
          index = m + 1;
          l = m + 1;
    }
  }
    return index;
    }
}
