import java.util.HashSet;

public class find_element_in_3_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {12,3,4,65,3,6};
        int[] arr2 = {6,8,9,12,8,4};
        int[] arr3 = {7,9,0,8,12};
        
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        for (int value : arr1) {
            a.add(value);
        }
        for (int i : arr2) {
            if (a.contains(i)) {
                b.add(i);
                a.remove(i);
            }
        }
        for(int k : arr3)
        {
            if(b.contains(k))
            {
                System.out.println(k);
                b.remove(k);
            }
        }
    }
}
