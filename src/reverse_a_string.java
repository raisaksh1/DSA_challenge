public class reverse_a_string {
    public static void main(String[] args) {
        String str = "Sakshi";
        StringBuilder str1 = new StringBuilder();
        int n =  str.length();

        str1.append(str);
        str1.reverse();
        System.out.println(str1);


    }
}
