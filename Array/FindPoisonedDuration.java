package Leetcode.Array;

public class FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        int res=0;
        int space=0;
        for(int i=0;i<timeSeries.length-1;i++){
            space=timeSeries[i+1]-timeSeries[i];
            if(space>=duration){
                res+=duration;
            }
            else {
                res+=space;
            }
        }
        return res+duration;
    }
}
