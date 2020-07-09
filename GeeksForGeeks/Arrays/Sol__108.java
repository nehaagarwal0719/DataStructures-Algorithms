 public static void printDuplicates(int a[], int n) {
        // add code here.
        
       int f=0;
        for(int i=0;i<n;i++){
            a[a[i] % n]=a[a[i]%n]+n;
        }
        for(int i=0;i<n;i++){
            if(a[i]/n>1){
             System.out.print(i+" ");
             f=1;
            }
        }
        if(f==0)
        System.out.print(-1);
    }