package com.liangyanbo.leetcode.problems.problem704;

//base binary search
class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length ==0){
            return -1;
        }
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(target>nums[mid]){
                left = mid+1;
            }else if(target<nums[mid]){
                right = mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}