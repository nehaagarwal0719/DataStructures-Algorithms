class Solution {
    
    public void reverse(String str){
        Stack<Character> st= new Stack<Character>();
        int c=0;
       while(c!=str.length()){
          st.push(str.charAt(c));
          c++;
       }  
       while(!st.isEmpty())
         System.out.print(st.pop());
         System.out.println();
    }

}