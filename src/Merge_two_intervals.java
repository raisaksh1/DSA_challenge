import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_two_intervals {
    static int[][] merge(int[][] intervals)
    {
        List<int[]> res = new ArrayList<>();

        if(intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals)
        {
            if(i[0] <= end){
                end = Math.max(end, i[1]);
            }else
            {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }


    public static void main(String[] args) {

        ArrayList<Integer>[][] list = new ArrayList[4][2];
        list[0][0].add(1);
        list[0][1].add(2);
        list[1][0].add(3);
        list[1][1].add(6);
        list[2][0].add(5);
        list[2][1].add(7);


    }
}
