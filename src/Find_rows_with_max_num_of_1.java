public class Find_rows_with_max_num_of_1 {
    public static void main(String[] args) {

        int arr[][] = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int count = 0;
        int max = 0;
        int index = 0;

        for(int i=0 ; i<4; i++){
            for(int j=0; j<4; j++)
            {
                if(arr[i][j] == 1) {
                    count++;
                }
            }
            if(count > max) {
                max = Math.max(max, count);
                 index = i;
            }
            count = 0;
        }
        System.out.println(max);
        System.out.println("at " + index);
    }
}
