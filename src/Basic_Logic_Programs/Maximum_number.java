package Basic_Logic_Programs;

import java.util.Scanner;

public class Maximum_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter value for a:");
        if (sc.hasNextInt()) {      //check the input is integer or not
            a = sc.nextInt();      
        } else {
            System.out.println("Invalid input for a");
            return;   // stop program
        }

        System.out.println("Enter value for b:");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Invalid input for b");
            return;
        }

        System.out.println("Enter value for c:");
        if (sc.hasNextInt()) {
            c = sc.nextInt();
        } else {
            System.out.println("Invalid input for c");
            return;
        }

        if (a > b && a > c) {
            System.out.println(a + " is greater");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater");
        } else if (c > a && c > b) {
            System.out.println(c + " is greater");
        } else {
            System.out.println("Some numbers are equal");
        }

        sc.close();
    }
}