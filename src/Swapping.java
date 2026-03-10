import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int  temp;
        System.out.println("Enter value of A : ");
        int a = sc.nextInt();

        System.out.println("Enter value of B : ");
        int b = sc.nextInt();

        System.out.println("Before Swapping:  " + "A = " + a + " "+ "B = "+ b);
        temp = a;
        a = b;
        b= temp;
        System.out.println("After Swapping: " + "A = " + a + " "+"B = "+ b);
    }
}
