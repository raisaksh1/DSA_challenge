import java.util.HashSet;
public class Find_Duplicate_char_in_String {
    public static void main(String[] args) {
        String str = "Sakakshi";
        char[] s = str.toCharArray();
        HashSet<Character> st = new HashSet<>();

        for (int i = 0; i < s.length-1; i++) {

            if(st.contains(s[i]))
            {
                System.out.println(s[i]);
            }
            st.add(s[i]);
        }
    }
}
