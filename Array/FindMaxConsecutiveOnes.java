package Leetcode.Array;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else {
                count=0;
            }
            max=max>count?max:count;
        }
        return max;
    }
}
