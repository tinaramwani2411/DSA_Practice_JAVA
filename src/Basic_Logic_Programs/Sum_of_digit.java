package Basic_Logic_Programs;

public class Sum_of_digit {
    public static void main(String[] args) {
        int count= 0;
        int sum = 0;
        int x = 56743;
        while(x!=0){ // if x is not blank or empty
            int y = x%10; //this return the last digit everytime
            sum = sum+y; //this add the digit in sum variable one by one
            x = x/10; //this return 0 everytime , use to count digits in a number
            count++;  //count increase after each iteration
        }
        System.out.println(count);       //digits in number
        System.out.println(sum);         //sum of all digits

    }
}
