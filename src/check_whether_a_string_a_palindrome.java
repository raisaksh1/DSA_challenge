public class check_whether_a_string_a_palindrome {
    public static void main(String[] args) {
        String s = "SakkaS";

        char[] ch = s.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n/2; i++) {
            if(ch[i] != ch[n-i-1])
            {
                System.out.println("Not a palindrome");
            }
        }
    }
}
