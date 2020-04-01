/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 int a[] = new int[n];
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }   
		 
		 int index= search(a);
		 System.out.println(a.length-index);
		}
		
		
	}
	
	 public static int search(int[] nums) {
            int left=0, right=nums.length-1,mid;
            while(left<=right){
                mid=left +(right-left)/2;
                if((mid==0 || nums[mid-1]==1) && nums[mid]==0)
                    return mid;
                if (nums[mid]==0 && nums[mid-1]==0)
                   right=mid-1;
                else
                     left=mid+1;
            }
        return -1;
    }
}