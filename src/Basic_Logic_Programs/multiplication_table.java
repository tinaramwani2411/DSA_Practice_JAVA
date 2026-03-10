package Basic_Logic_Programs;

import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the value : ");
//        int n = sc.nextInt();
//
//        for(int i=1; i<10; i++){
//            System.out.println(n + "* " + i + " = " +n*i );
//        }
        while(true){
            System.out.println("Enter a value:");
            int n =sc.nextInt();

            for(int i=1; i<10; i++){
            System.out.println(n + "* " + i + " = " +n*i );
            }

            System.out.println();
        }

    }
}
