package Leetcode.String;

public class FindLUSlength {
    public int findLUSlength(String a, String b) {
        return  a.equals(b)?-1:Math.max(a.length(),b.length());
    }
}
