import java.util.*;
public class Print_element_in_sorted_order {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        List<Integer> l = new ArrayList<>();

        for(int i=0; i<arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++) {

                l.add(arr[i][j]);
            }
        }

        Collections.sort(l);

        for(int i=0; i<l.size(); i++)
        {
            System.out.print(l.get(i) + " ");
        }
    }
}