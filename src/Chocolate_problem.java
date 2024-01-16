import java.util.Arrays;
public class Chocolate_problem {
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};

        int m = 7;

        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            int j = i+m-1;

            if(j>=arr.length)
            {
                break;
            }
            int diff = arr[j] - arr[i];

            min_diff = Math.min(min_diff, diff);

        }
        System.out.println(min_diff);

    }
}
