package Leetcode.Array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum[]=new int[2];
        int i,j;
        int a,b;
        for(i=0;i<nums.length-1;i++){
            a=nums[i];
            for(j=i+1;j<nums.length;j++){
                b=nums[j];
                if((a+b)==target){
                    sum[0]=i;
                    sum[1]=j;
                }

            }
        }
        return sum;
    }
}
