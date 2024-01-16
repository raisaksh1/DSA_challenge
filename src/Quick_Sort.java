public class Quick_Sort {

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

    public static void main(String[] args) {
        int arr[] = {4,8,1,9,3,7,4};
        int n = arr.length;
        quicksort(arr, 0, n-1);

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
