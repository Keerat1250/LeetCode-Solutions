class Solution {
    public char findTheDifference(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s=new String(c1);
        t=new String(c2);
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