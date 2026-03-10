package Basic_Logic_Programs;

import java.lang.*;

 class sum_of_squares_till_n {
        public static int summation(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i * i;
            }
            return sum;
        }
        public static void main(String[] args){
            int n= 5;
            System.out.println(summation( n));
    }
}
