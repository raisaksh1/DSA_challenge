import java.util.*;
public class Find_the_kth_smallest_array {
    public static void main(String[] args) {
        int[] arr = {23,56,78,98,53,21};
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
