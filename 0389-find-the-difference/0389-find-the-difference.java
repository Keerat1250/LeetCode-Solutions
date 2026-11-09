class Solution {
    public char findTheDifference(String s, String t) {
   
        int xorSum=0;
        for(int ch=0;ch<s.length();ch++)
        {
            xorSum=xorSum^s.charAt(ch);

        }
        for(int ab=0;ab<t.length();ab++)
        {
            xorSum=xorSum^t.charAt(ab);
        }
        return (char) xorSum;
    }
}