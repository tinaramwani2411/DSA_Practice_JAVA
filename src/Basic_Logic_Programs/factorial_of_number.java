package Basic_Logic_Programs;

import java.util.Scanner;
public class factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find the factorial: ");
        int fact = 1;
        int n = sc.nextInt();
        for (int i= 1; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
