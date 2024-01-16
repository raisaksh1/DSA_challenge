import java.util.Arrays;

public class find_a_specific_pair_in_a_matrix {
    static final int N = 5;

    static int findMax(int[][] mat)
    {
        int[] temp1 = new int[N];
        int[] temp2 = new int[N];

        temp1[N-1] = mat[N-1][N-1];

        for(int j=N-2; j>=0; j--)
        {
            temp1[j] = Math.max(temp1[j+1], mat[N-1][j]);
        }

        int maxval = Integer.MIN_VALUE;

        for(int i=N-2; i>=0; i--)
        {
            temp2[N-1] = Math.max(temp1[N-1], mat[i][N-1]);
            for(int j=N-2; j>=0; j--)
            {
                maxval = Math.max(maxval, temp1[j+1] - mat[i][j]);
                temp2[j] = Math.max(mat[i][j], Math.max(temp1[j], temp2[j + 1]));
            }
            temp1 = Arrays.copyOf(temp2, temp2.length);
        }
        return maxval;
    }

    public static void main(String[] args) {

        int[][] mat = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
        };

        System.out.println("Maximum Value is " + findMax(mat));

    }
}
