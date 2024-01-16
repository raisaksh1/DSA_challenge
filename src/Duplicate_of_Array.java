public class Duplicate_of_Array {
    public static void main(String[] args) {
        int a[] = {3,1,3,4,2};
        int dup =0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[j] == a[i])
                {
                    dup = a[j];
                }
            }
        }
        System.out.println(dup);
    }
}
