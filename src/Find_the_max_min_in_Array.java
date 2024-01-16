import java.util.*;
public class Find_the_max_min_in_Array {
    public static void main(String[] args) {
        int[] a = {1, 4,6,8,90,73,43};
        Arrays.sort(a);
        System.out.println("Max");
        System.out.println(a[a.length-1]);
        System.out.println("Min");
        System.out.println(a[0]);

    }
}
