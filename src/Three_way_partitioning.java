public class Three_way_partitioning {
    public static void main(String[] args) {
        int arr[] = {12,4,8,23,9,6,43,89,76,65};
        int sm = 20;
        int me = 40;

        int n = arr.length;
        int start =0, end = n-1;

        for(int i=0; i<= end; )
        {
            if(arr[i] < sm)
            {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }
            else if(arr[i] > me)
            {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }
            else
            {
                i++;
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
