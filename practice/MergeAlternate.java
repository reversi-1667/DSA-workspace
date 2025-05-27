class MergeAlternate {
    public String mergeAlternately(String word1, String word2) {
        int l=0,r=0;
        char[] s= new char[word1.length()+word2.length()];
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        int length=word1.length()+word2.length();
        for(int i=0;i<length;i++)
        {
            if((i%2==0 && l<w1.length)||r>=w2.length)
            {
                s[i]=w1[l];
                l++;
            }
            else if(r<w2.length)
            {
                s[i]=w2[r];
                r++;
            }
        }
        String a= new String(s);
        return a;
    }

public static void main(String[] args)
{
String s1="abc";
String s2="def";
String s3=mergeAlternately(s1,s2);
}
}  
