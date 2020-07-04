class Solution {
    public int kthGrammar(int N, int K) {
        if(N==1 && K==1)
            return 0;
        int len=(int)Math.pow(2,N-1);
        if(K<=len/2)
          return  kthGrammar(N-1,K);
        else
         return   (kthGrammar(N-1,K-len/2)==0?1:0);
    }
}