import java.util.*;
public class Find_the_union_and_intersection {
    public static void main(String[] args) {
        int[] arr1 = {23,4,56,78,65,42};
        int[] arr2 = {56,87, 42,4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int arr;
        int a1 = arr1.length;
        int a2 = arr2.length;
        int i= 0;
        int j = 0;
        while(i<a1 && j<a2)
        {
            if(arr1[i] < arr2[j])
            {
                arr = arr1[i];
                System.out.println(arr);
                i++;
            }
            if(arr2[j] < arr1[i])
            {
                arr = arr1[j];
                System.out.println(arr);
                j++;
            }
            try {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Intersection " + arr2[j++]);
                    i++;
                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
