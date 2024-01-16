import java.util.Arrays;

public class Next_permutation {
    public static void main(String[] args) {
        int[] ar = {1,3,2};
        int n = ar.length;

        for(int i=n-1; i>=0; i--)
        {
            if (i > 0) {

                if (ar[i] > ar[i - 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i - 1];
                    ar[i - 1] = temp;
                    break;
                }
            }
            if(i ==0)
            {

            }
            else {
                Arrays.sort(ar);
                break;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
