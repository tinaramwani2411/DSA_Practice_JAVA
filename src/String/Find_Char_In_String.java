package String;
import java.util.Scanner;

public class Find_Char_In_String {

    public static int FindChar(String s, char ch) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String s = sc.nextLine();

        System.out.println("Enter char you want to find");
        char ch = sc.next().charAt(0);

        System.out.println(FindChar(s, ch));
    }
}