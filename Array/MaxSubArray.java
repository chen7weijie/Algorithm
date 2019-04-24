package Leetcode.Array;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum[i-1]<0){
                sum[i]=nums[i];
            }
            else{
                sum[i]=sum[i-1]+nums[i];
            }
            if(sum[i]>max){
                max=sum[i];
            }
        }
        return max;
    }
}
