package Leetcode.Array;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] result=new int[A.length];
        int pre=0;
        int last=A.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                result[pre]=A[i];
                pre++;
            }
            else {
                result[last]=A[i];
                last--;
            }
        }
        return result;
    }
}
