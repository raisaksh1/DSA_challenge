public class Maximum_product_subarray {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,-1,-3,8,-2};
        int max = 1;
        int pre = 1, suf = 1;
        int n = arr.length;

        for(int i=0; i<arr.length; i++)
        {
            if(pre == 0)
            {
                pre = 1;
            }
            if(suf == 0)
            {
                suf = 1;
            }
            pre *= arr[i];
            suf *= arr[n-i-1];
            max = Math.max(max, Math.max(pre, suf));

        }
        System.out.println(max);

    }
}
