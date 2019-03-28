package lesson5;

public class StringUtils {

    public static String reverce(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void printZlassFromText(String st) {
        char[] simbols = st.toCharArray();
        for (char ch : simbols) {
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e') {
                System.out.print(ch);
            }
        }
        System.out.println();
    }


}
