public class smallest_subarray_with_sum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,3,8,9,4,6, 13,1,0};
        int n = arr.length;
        int x = 12;

        int start = 0 , end = 0 ;
        int sum =0 ; int min = Integer.MAX_VALUE;

        while(end < n)
        {
            while(sum <= x && end < n)
            {
                sum += arr[end ++];
            }
            while(sum > x && start <n)
            {
                if(end - start < min)
                {
                    min = end - start;
                }
                sum = sum - arr[start++];
            }
        }
        System.out.println(min);
    }
}
