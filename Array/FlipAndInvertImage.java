package Leetcode.Array;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0,k=A[0].length-1;j<A[0].length;j++,k--){
                res[i][j]=A[i][k];
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(res[i][j]==1){
                    res[i][j]=0;
                }
                else {
                    res[i][j]=1;
                }
            }
        }

        return res;
    }
}
