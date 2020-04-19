or(int i=0;i<arr.size();i++){
          
        
              if(arr.contains(arr.get(i)*r) && arr.contains(arr.get(i)*r*r));
                 c++;
                if(i!=arr.size()-1 && arr.get(i)==arr.get(i+1) )
                    c++;

        
      }
      return c;