import java.util.Stack;

public class Maximum_area_of_histogram {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        Stack<Integer> s = new Stack<>();
        int n = arr.length;

        int max_area = 0;
        int tp;
        int area_with_top;

        int i=0;
        while(i<n)
        {
            if(s.empty() || arr[s.peek()] <= arr[i])
            {
                s.push(i++);
            }
            else
            {
                tp = s.peek();
                s.pop();

                area_with_top = arr[tp] * (s.empty() ? i : i - s.peek() -1);

                if(max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while(!s.empty())
        {

                tp = s.peek();
                s.pop();

                area_with_top = arr[tp] * (s.empty() ? i : i - s.peek() -1);

                if(max_area < area_with_top)
                    max_area = area_with_top;

        }
        System.out.println(max_area);

    }
}
