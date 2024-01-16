public class Triplet_sum_in_an_array {

    public static int partition(int arr[], int low, int high)
    {
        int i = low -1;
        int pivot = arr[high];

        for(int j=low; j<high; j++)
        {
            if(arr[j]< pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }
    public static void quicksort(int arr[], int low, int high){
        int pivot ;
        if(low<high)
        {
            pivot = partition(arr, low, high);

            quicksort(arr, low, pivot -1);
            quicksort(arr, pivot+1, high);
        }

}
    public static void trisum(int arr[], int arr_size, int sum)
    {
        int l,r;

        quicksort(arr, 0, arr_size-1);

        for(int i=0; i<arr_size-1; i++)
        {
            l = i+1;
            r = arr_size-1;
            if(arr[i] + arr[l] + arr[r] == sum)
            {
                System.out.println("triplet is :" + arr[i] + ", " + arr[l] + ", " + arr[r]);
            }
            else if(arr[i] + arr[l] +arr[r] < sum)
            {
                l++;
            }
            else {
                r--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {3,5,7,9,1,0,4,8};
        int sum = 24;
        int n = arr.length;

        trisum(arr, n, sum);

    }
}
