{
    public static void solution(String s1, String s2){
        // Your code here
        HashSet<Character> hs= new HashSet<>();
        int j,f=0;
        for( j=0;j<s2.length();j++)
          hs.add(s2.charAt(j));
        
        for( j=0;j<s1.length();j++)  {
           if(hs.contains(s1.charAt(j))){
              System.out.print(s1.charAt(j));
               f=1;
               break;
           }
        }
        if(f==0)
        System.out.print("No character present");
             }
}