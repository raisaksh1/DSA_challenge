import java.util.Arrays;
import java.util.HashMap;
public class element_appearing_more_than {
   /* public static void element(int nums[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(int key : map.keySet())
        {
            if(map.get(key) > n/3)
            {
                System.out.println(key);
            }
        }
    }*/

    public static void element(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();

       int n = arr.length;
       for(int i=0; i<n; i++)
       {
           if(map.containsKey(arr[i]))
           {
               map.put(arr[i], map.get(arr[i]) + 1);
           }
           else {
               map.put(arr[i], 1);
           }
       }
       for(int key : map.keySet())
       {
           if(map.get(key) > n/3)
           {
               System.out.println(key);
           }
       }

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,4,4,4,4};
        element(arr);
    }
}
