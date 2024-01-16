import java.util.HashSet;
import java.util.Set;
public class find_if_there_is_any_subarray {
    public static void main(String[] args) {
        int arr[] = {1,5,0,-3,3};
        Set<Integer> hs = new HashSet<>();

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                System.out.println(sum);
            }
            hs.add(sum);
        }
        System.out.println(sum);
    }
}
