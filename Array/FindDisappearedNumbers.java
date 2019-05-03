package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] array=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            array[nums[i]-1]=1;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==0)
                list.add(i+1);
        }
        return list;
    }
}
