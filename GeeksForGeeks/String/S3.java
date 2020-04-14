static int minimumSwaps(int[] arr) {

       int  swap = 0;
        for (int i = 0; i < arr.length; i++) { 
                while (i+1 != arr[i]) {
                        int temp = arr[arr[i] - 1];
                        arr[arr[i] - 1] = arr[i];
                        arr[i] = temp;
                        swap += 1;
                }
        }
        return swap;
    }