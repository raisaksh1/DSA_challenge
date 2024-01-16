import java.util.Stack;
public class Max_size_rectangle {
    static int maxHist( int C, int row[])
    {
        Stack<Integer> s = new Stack<>();
        int top_val = 0;
        int area =0;
        int max_area = 0;

        int i=0;

        while(i<C)
        {
            if(s.empty() || row[s.peek()] <= row[i])
            {
                s.push(i++);
            }
            else
            {
                top_val = row[s.peek()];
                s.pop();
                area = top_val * i;

                if(!s.empty())
                {
                    area = top_val * (i - s.peek() -1);
                }
                max_area = Math.max(area, max_area);
            }
        }

        while(!s.empty())
        {
            top_val = row[s.peek()];
            s.pop();
            area = top_val * i;

            if(!s.empty())
            {
                area = top_val * (i - s.peek() -1);
            }
            max_area = Math.max(area, max_area);
        }

        return max_area;
    }

    static int maxrec(int R, int C, int [][] arr)
    {
        int res = maxHist(C,arr[0]);

        for(int i=1; i<R; i++)
        {
            for(int j=0; j<C; j++)
            {
                if(arr[i][j] == 1)
                {
                    arr[i][j] += arr[i-1][j];
                }
            }
            res = Math.max(res, maxHist(C,arr[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int A[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };

        int R = 4;
        int C = 4;

        System.out.println("Area of max rec is : " + maxrec(R,C,A));
    }
}
