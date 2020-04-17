public static boolean checkPanagram  (String s)
    {
          java.util.HashSet<Character> hs=new java.util.HashSet<Character>();  
        
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))
            hs.add(s.charAt(i));
        }
        if(hs.size()==26)
         return true;
        return false; 
    }