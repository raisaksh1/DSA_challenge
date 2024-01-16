public class alternating_the_elements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-4,-5,-6};
        int len = arr.length;
        int arr2[] = new int[len/2];
        int arr1[] = new int[len/2];
        int k=0 , j=0;
        int m=0, n=0;
        for(int i=0; i<len ; i++)
        {
            if(arr[i]<0)
            {
                arr1[k++] = arr[i];
            }
            else {
                arr2[j++] = arr[i];
            }
        }
        for(int i=0; i<len ; i++)
        {
            if(i%2 ==0)
            {
                arr[i] = arr[m++];
            }
            else
            {
                arr[i] = arr[n++];
            }
        }

    }
}
