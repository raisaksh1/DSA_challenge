import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find_median_in_a_sorted_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                l.add(arr[i][j]);
            }
        }

        Collections.sort(l);
        int median = 0;

        int mid = l.size()/2;
        if(l.size()%2== 0)
        {
            median = (l.get(mid-1) + l.get(mid))/2;
        }
        else
        {
            median = l.get(mid);
        }
        System.out.println(median);
    }
}
