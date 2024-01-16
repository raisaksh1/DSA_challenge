public class count_inversion {
    int merge(int[] arr, int low, int mid , int high )
    {
        int inv = 0;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int a[] = new int[n1];
        int b[] = new int[n2];
        for(int i=0; i<n1; i++){
            a[i] = arr[low + i];
        }
        for(int i=0; i<n2; i++){
            b[i] = arr[mid + i + 1];
        }
        int i =0,  j =0, k =low;
        return 0;
    }

     int  mergesort(int[] arr, int low, int high)
     {
         int inv = 0;
         if(low < high)
         {
             int mid = (low + high)/2;
             inv += mergesort(arr, low, mid);
             inv += mergesort(arr, mid+1, high);
             inv += merge(arr, low, mid, high);
         }

         return inv;
     }
    public static void main(String[] args) {

    }
}
