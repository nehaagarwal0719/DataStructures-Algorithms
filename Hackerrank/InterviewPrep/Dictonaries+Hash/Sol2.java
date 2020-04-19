 HashSet<String> hs= new HashSet<String>();
        int c=0;

      for(int i=0;i<s.length();i++){
          for(int j=i+1;j<=s.length();j++){
    
                  String s1=s.substring(i,j);
                  char tempArray[] = s1.toCharArray(); 
                    Arrays.sort(tempArray);
                    if(hs.contains(new String(tempArray)))
                       c++;
                    else
                      hs.add(new String(tempArray));   

              
          }
              