
class GfG
{
    int strstr(String str, String target)
    {
        int i=0,j=1,ind=0;
       while(i<str.length()){
           if(str.charAt(i)!=target.charAt(0))
              i++;
           else{
               ind=i;
               ind++;
               while(j<target.length() && ind<str.length()){
                   if(target.charAt(j)!=str.charAt(ind))
                    break;
                    ind++;j++;
               }
               if(ind-i==target.length())
                 return i;
                 i++;j=1;
           }      
       }
       return -1;
    }
}
