import java.util.HashMap;

public class Max_profit_by_buyying_and_selling {
    public static void main(String[] args) {

        int arr[] = {10,22,5,75,65,80};
        int f_buy = Integer.MIN_VALUE;
        int f_sell = 0;
        int s_buy = Integer.MIN_VALUE;
        int s_sell = 0;

        for(int i=0; i<arr.length; i++)
        {
            f_buy =  Math.max(f_buy, -arr[i]);
            f_sell = Math.max(f_sell, f_buy + arr[i]);
            s_buy = Math.max(s_buy, f_sell - arr[i]);
            s_sell = Math.max(s_sell, s_buy + arr[i]);
        }
        System.out.println(s_sell);
    }
}
