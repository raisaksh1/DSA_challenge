public class rotate_an_array_2 {

        public static void reverse(int[] arr, int a, int b)
        {
            while(a<b)
            {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        public static void rotate(int[] nums, int k) {

            reverse(nums, 0,k-1);
            reverse(nums,k,nums.length-1);
            reverse(nums,0,nums.length-1);
        }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(a,k);
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
    }


}
