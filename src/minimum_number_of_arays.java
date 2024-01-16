import java.util.Arrays;
import java.util.HashMap;

public class minimum_number_of_arays {

    public static int minswaps(int arr[], int N) {
        int ans = 0;
        int temp[] = Arrays.copyOfRange(arr, 0, N);
        HashMap<Integer, Integer> hs = new HashMap<>();

        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            hs.put(arr[i], i);
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                //  int init = arr[i];
                swap(arr, i, hs.get(temp[i]));

                hs.put(arr[i], hs.get(temp[i]));
                hs.put(temp[i], i);
            }
        }
        return ans;
    }
        public static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }



    public static void main(String[] args) throws Exception
    {
        int[] a = { 101, 758, 315, 730, 472, 619, 460, 479};
        int n = a.length;
        System.out.println(minswaps(a, n));

    }
}
