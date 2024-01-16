public class minimum_number_of_merges {
    static int minswaps(int[] arr, int n)
    {
        int ans = 0;
        int i=0;
        int j=0;
        for(i=0, j = n-1; i<=j;)
        {
            if(arr[i] == arr[j]) {
                i++;
                j--;
            }
            else if(arr[i]>arr[j])
            {
                j--;
                arr[j] += arr[j+1];
                ans++;
            }
            else {
                i++;
                arr[i] += arr[i-1];
                ans++;
            }
        }
        return ans;
    }

    public static void  main(String[] args)
    {
        int arr[] = new int[] {1,4,5,9,1};
        System.out.println(minswaps(arr, arr.length));
    }
}
