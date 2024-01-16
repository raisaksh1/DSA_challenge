import java.util.HashMap;
import java.util.HashSet;

public class Function_to_find_subarray {
    public static void main(String[] args) {
        int [] arr = {12,4, 3,5,7,8,0,7,5,44};
        int [] brr = {3,4,5};

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }

        for(int i=0; i<brr.length; i++)
        {
            if(!hs.contains(brr[i]))
            {
                System.out.println("no it is not the subset :");
            }
        }
    }
}
