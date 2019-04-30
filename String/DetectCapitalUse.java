package Leetcode.String;

public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        char[] strArray=word.toCharArray();
        boolean isCaptitalUse=true;
        if(strArray[0]>=65&&strArray[0]<=90){
            for(int i=1;i<strArray.length-1;i++){
                if((strArray[i]>=65&&strArray[i]<=90&&strArray[i+1]>=65&&strArray[i+1]<=90)
                        ||(strArray[i]>=97&&strArray[i]<=122&&strArray[i+1]>=97&&strArray[i+1]<=122)){
                    isCaptitalUse=true;
                }
                else {
                    isCaptitalUse=false;
                    break;
                }
            }
        }
        else {//第一个字母为小写
            for(int i=1;i<strArray.length;i++){
                if(strArray[i]>=65&&strArray[i]<=90){
                    isCaptitalUse=false;
                    break;
                }
            }
        }
        return isCaptitalUse;
    }
}
