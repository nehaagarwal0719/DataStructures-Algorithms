class Solution {
    public int singleNumber(int[] nums) {
        
        int i;
        Arrays.sort(nums);
        for( i=0;i<nums.length-1;i=i+2){
            if(nums[i]!=nums[i+1]){
                break;
            }      
        }

        return nums[i];
    }
}


// BETTER WAY  


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
         
         search(a,0,n-1);
    
         
         }
    }
    
    public static void search(int[] arr, int low, int high) 
    { 
        if(low > high) 
            return; 
        if(low == high) 
        { 
            System.out.println(arr[low]); 
            return; 
        } 
          
    
        int mid = (low + high)/2; 

        if(mid % 2 == 0) 
        { 
            if(arr[mid] == arr[mid+1]) 
                search(arr, mid+2, high); 
            else
                search(arr, low, mid); 
        } 
        
        else if(mid % 2 == 1) 
        { 
            if(arr[mid] == arr[mid-1]) 
                search(arr, mid+1, high); 
            else
                search(arr, low, mid-1); 
        } 
    } 
}
