class LexSort
{
    // complete the function
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
         ArrayList<String> ans=new ArrayList<>();
	       
	       solve(s,"",ans);
	       Collections.sort(ans);
	       return ans;
    }
     public static void solve(String ip,  String op, ArrayList<String> ans){
	     if(ip.length()==0){
	         ans.add(op);return;
	     }
	     
	     //ArrayList<Character> op1=new ArrayList<>();
	     //ArrayList<Character> op2=new ArrayList<>();
	     String op1=op,op2=op;
	     //op2.add(ip.get(0));
	     //ip.remove(0);
	     solve(ip.substring(1),op1,ans);
	     solve(ip.substring(1),op2+ip.charAt(0),ans);
	     
	 }
}
                                                       