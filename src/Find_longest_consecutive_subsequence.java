import java.util.Arrays;

public class Find_longest_consecutive_subsequence {
    public static void main(String[] args) {
        int[] arr = {12,4,7,9,8,3,1,2};
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        int mx = 1;


        for(int i=0; i<n-1; i++) {
            if(arr[i + 1] == arr[i] + 1) {
                count++;
            }
            else if(arr[i] == arr[i+1])
            {
                continue;
            }
            else {
                mx = Math.max(mx, count);
                count = 1;
            }
        }
        mx = Math.max(mx, count);
        System.out.println(mx);
    }
}
