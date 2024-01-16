import java.util.Arrays;

public class rotate_an_array_by_one {

        public static void rotate_one(int[] nums)
        {
            int temp;
            temp = nums[0];
            for(int i=1; i<nums.length; i++)
            {
                nums[i-1] = nums[i];
            }
            nums[nums.length - 1] = temp;
        }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%(nums.length);
        if(k<0)
        {
            k= k+ nums.length;
        }
        for(int i=1; i<=k; i++)
        {
            rotate_one(nums);
        }
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]);
        }
    }
}