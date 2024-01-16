import java.util.Stack;
public class Stock_span_problem {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        Stack<Integer> s = new Stack<>();

        int[] res = new int[arr.length];
        s.push(0);
        res[0] = 1;

        for(int i=1;  i<arr.length; i++ )
        {
            if(!s.empty())
            {
                while(!s.empty() && arr[s.peek()] < arr[i]) {
                    s.pop();
                }
            }
            if(s.empty())
            {
                res[i] = i+1;
            }
            else {
                res[i] =  i-s.peek();
            }
            s.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i]);
        }
    }
}
