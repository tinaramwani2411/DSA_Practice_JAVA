package Basic_Logic_Programs;

public class pattern_program {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){ //five row
            for(int j = 1 ; j<=i; j++){ //three column with 1 , 2 , 3 ,4 , 5 stars
                System.out.print("*"); //remember use print to print star in one line
            }
            System.out.println(); // for next line
        }
    }}
