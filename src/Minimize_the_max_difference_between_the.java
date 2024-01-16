import java.util.Arrays;

public class Minimize_the_max_difference_between_the {
    public static void main(String[] args) {
        int a[] = {32,56,98,21,74,71};
        int k = 5;
        Arrays.sort(a);
        int diff = a[a.length-1] - a[0];
        int maxx = a[a.length];
        int minn = a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i]-k < 0)
            {
                continue;
            }
            maxx = Math.max(a[i-1]+k, a[a.length-1]-k);
            minn = Math.min(a[0]+k, a[i]-k);

            diff = Math.min(diff, maxx - minn);
        }
        System.out.println(diff);
    }
}
