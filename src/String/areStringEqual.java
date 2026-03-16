package String;
import java.util.Scanner;

public class areStringEqual {
    public static boolean CheckString(String a , String b){
        return a.equals(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String a = sc.next();
        System.out.println("Enter another String");
        String b = sc.next();

        if(CheckString(a,b)){
            System.out.println("Yes both are equal");
        } else{
            System.out.println("No both are different");
        }
    }
}
