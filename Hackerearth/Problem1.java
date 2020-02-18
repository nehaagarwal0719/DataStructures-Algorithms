
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
            for( i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        c++;
                    }
                }
            }
        System.out.println(c);    
    }
}
