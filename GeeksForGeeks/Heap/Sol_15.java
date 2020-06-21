class MinHeap {
    int[] harr;
    int capacity, heap_size;
    MinHeap(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }

    // You need to write code for below three functions
    int extractMin() {
        // Your code here.
        if(heap_size<=0)
          return -1;
        
        if(heap_size==1)  {
         heap_size--;
         return harr[0]; 
        }
        
        int ans=harr[0];
        harr[0]=harr[heap_size-1];
        heap_size--;
        MinHeapify(0);
        
        return ans;
    }

    void insertKey(int k) {
        
        if(heap_size>=capacity)
           return;
           
        if(heap_size<capacity){
           heap_size++;
           harr[heap_size-1]=k;
        }
        
        int i=heap_size-1;
        while(i>=0 && harr[parent(i)]>harr[i]){
            int temp=harr[parent(i)];
            harr[parent(i)]=harr[i];
            harr[i]=temp;
            i=parent(i);
        }
    }

    void deleteKey(int i) {
        
        if(i < 0 || i >= heap_size)
            return;
            
        decreaseKey(i, Integer.MIN_VALUE); 
        extractMin(); 
    }

    // Decrease key operation, helps in deleting the element
    void decreaseKey(int i, int new_val) {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    /* You may call below MinHeapify function in
      above codes. Please do not delete this code
      if you are not writing your own MinHeapify */
    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i]) smallest = l;
        if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            MinHeapify(smallest);
        }
    }
}
