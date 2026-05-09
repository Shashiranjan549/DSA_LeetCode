class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int ChildGreedFactorIndex=0;
        int CookieSizeIndex=0;
        int TotalChildCount=g.length;
        int TotalCookieCount=s.length;

        int SatisfiedChildren=0;
        while(ChildGreedFactorIndex <TotalChildCount  && CookieSizeIndex<TotalCookieCount)
        {
            if(s[CookieSizeIndex]>=g[ChildGreedFactorIndex]){
                ++SatisfiedChildren;    // one child satisfied
                ++ChildGreedFactorIndex;    // move to second child
                ++CookieSizeIndex;
            } else{
                ++CookieSizeIndex;
            }
        }
        return SatisfiedChildren;
        
    }
}