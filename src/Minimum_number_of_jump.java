public class Minimum_number_of_jump {

    public static void jump(int arr[])
    {
        int des = 0;
        int pos = 0;
        int jump = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            des = Math.max(des, arr[i]+i);

            if(pos == i)
            {
                pos = des;
                jump++;
                System.out.println(pos);
            }
        }
        System.out.println(jump);
    }


    public static void main(String[] args) {
        int arr[] = {1,3,5,8,2,2,1,7,6,8,9};
        jump(arr);
    }
}
