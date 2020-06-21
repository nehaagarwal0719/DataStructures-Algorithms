import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
        int data;
        Node left,right;
        
        Node(int x){
            data=x;
            left=right=null;
        }
    }
    
class GFG {
    
     //static Node root;
    
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		    
		    int n=sc.nextInt();
		    int a[]= new int[n],j;
		    for(j=0;j<n;j++){
		        a[j]=sc.nextInt();
		    }
		   Node root=convert(a,0,n-1);
		    preorder(root);
		    System.out.println();  
		}   
	}
	
	public  static Node convert(int a[], int l, int r){
	    if(l>r)
	      return null;
	    int mid=(l+r)/2;
	    Node temp=new Node(a[mid]);
	    
	    temp.left=convert(a,l,mid-1);
	    temp.right=convert(a,mid+1,r);
	    
	    return temp;
	    
	}
	
	public static void preorder(Node r){
	    if(r==null)
	      return;
	      
	    System.out.print(r.data+" ");
	    preorder(r.left);
	    preorder(r.right);
	}
}