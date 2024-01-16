public class Search_an_element {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
        int k = 6;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i][j] == k) {
                    System.out.println("Found at (" + i + "," + j + ")");
                }
            }
        }
    }
}
