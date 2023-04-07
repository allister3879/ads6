public static int findMin(int n, int[] arr){
        if(n==1){
            return arr[0];
        }else {
            int min = findMin(n-1, arr);
            return Math.min(min, arr[n-1]);
        }
    }
