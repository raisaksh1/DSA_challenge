import java.util.HashMap;

import static java.lang.Math.abs;

public class sum_of_the_pairs {
    static int getPairsCount(int[] arr, int n, int k) {

        HashMap<Integer, Integer> res = new HashMap<>();
            int  count = 0;
            for(int i = 0; i<n; i++){
            if(res.containsKey(k - arr[i]))
            {
                count += res.get(k - arr[i]);
            }
            if(res.containsKey(arr[i]))
            {
                res.put(arr[i], res.get(arr[i]) + 1);
            }
            else
            {
                res.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int arr[] = {5,0,6,7,-1};
        int n = arr.length;
        int sum = 6;
        System.out.println("Count of pairs is :" + getPairsCount(arr, n, sum));
    }
}
