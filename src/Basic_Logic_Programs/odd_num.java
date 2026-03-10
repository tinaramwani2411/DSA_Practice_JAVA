package Basic_Logic_Programs;

import java.util.Scanner;
public class odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i =0 ; i<= 100; i++ ){
            if(i%2 != 0){
                if(i>50){
                    sum = sum+i;
                }
            }
        }
        System.out.println(sum);
    }

}
