import java.util.Stack;

public class Next_smallest_element {
    public static void main(String[] args) {
        int[] arr = {1,4,3,8};
        Stack<Integer> s = new Stack<>();
        int[] result = new int[arr.length];

        for(int i= arr.length-1; i>=0; i--)
        {
            if(!s.empty())
            {
                while(!s.empty() && s.peek() > arr[i])
                {
                    s.pop();
                }
            }
            if(s.empty())
            {
                result[i] = -1;
            }
            else
            {
                result[i] = s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                    result[i]
            );
        }
    }
}
