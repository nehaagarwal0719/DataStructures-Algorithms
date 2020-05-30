class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int c=0,f=0;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='x' && c<0){
             f=1;
           }
           else if( ch=='x')
             c++;
             
           else if(ch=='y')
             c--;
       }
       if(c==0 && f==0)
      System.out.println(1);
      else
        System.out.println(0);
    }
}