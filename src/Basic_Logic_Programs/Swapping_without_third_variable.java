package Basic_Logic_Programs;

public class Swapping_without_third_variable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        a = a+b; // a = 15
        b = a-b; // b = 5
        a = a-b; // a = 15 - 5 = 10

        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
