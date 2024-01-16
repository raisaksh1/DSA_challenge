public class largest_sum_contiguous {
    public static void main(String[] args) {
        int a[] = {2,3,4,67,87,3,2,99,101,23};
        int currsum = 0;
        int maxsum = 0;

        for(int i=0; i<a.length; i++)
        {
            currsum += a[i];
            maxsum = Math.max(maxsum, currsum);
            if(currsum < 0)
            {
                currsum = 0;
            }
            System.out.println(maxsum);
        }
        System.out.println(maxsum);
    }
}
