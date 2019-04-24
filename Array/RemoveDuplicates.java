package Leetcode.Array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow=1;
        int fast;
        for(fast=1;fast<nums.length;fast++){
            if(nums[slow-1]!=nums[fast]){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
