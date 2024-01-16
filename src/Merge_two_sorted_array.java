import java.util.Arrays;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {5,6,7,8,9};
        int len = a.length + b.length;
        int[] c = new int[len];
        for(int i=0; i<a.length; i++) {
            c[i] = a[i];
            System.out.println(c[i]);
        }
        for(int i =0; i<b.length; i++) {
            c[i] = b[i];
            System.out.println(c[i]);
        }
    }
}
