public class Reverse_the_Array {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'D'};

        int i = 0;
        int j = (arr.length - 1);
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        System.out.println(arr);
    }

}
