package Leetcode.String;

public class Test_709 {
    public String toLowerCase(String str) {
        StringBuffer res=new StringBuffer();
        if(str!=null&&!str.isEmpty()){
            for (char ch:str.toCharArray()){
                if(ch>='A'&&ch<='Z'){
                    ch+=32;
                }
                res.append(ch);
            }
        }
        return res.toString();
    }
}
