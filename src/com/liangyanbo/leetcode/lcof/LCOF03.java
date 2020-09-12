package com.liangyanbo.leetcode.lcof;

//key: 数据为0到n-1
class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (currentValue == i) {
                continue;
            }
            int targetValue = nums[currentValue];
            if (currentValue == targetValue) {
                return currentValue;
            } else {
                nums[currentValue] = currentValue;
                nums[i] = targetValue;
            }
        }
        return -1;
    }
}
