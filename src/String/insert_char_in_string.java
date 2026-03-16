package String;

public class insert_char_in_string {

    static String InsertChar( StringBuilder s, int pos , char ch){
         s.insert(pos, ch);
         return s.toString();
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Pikachu");
        int pos = 4;
        char ch = 'i';

        System.out.println(InsertChar( s , pos , ch));
    }
}
