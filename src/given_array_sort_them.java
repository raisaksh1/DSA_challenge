public class given_array_sort_them {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int num =0;
        for (int i =0; i<arr.length; i++)
        {
            if(arr[i]> num)
            {
                num = arr[i];
            }
        }
        System.out.println(num);
    }
}
