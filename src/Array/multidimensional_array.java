package Array;

public class multidimensional_array {
    public static void main(String[] args) {
        int nums [][] = new int[3][4];
        int random = 0;

        for(int i = 0; i<3; i++) {

            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random()* 100); //remember he random function generates decimal values so convert it
                System.out.print(nums [i][j] + " ");
            }
        }
//        for(int i = 0; i<3; i++){
//
//            for(int j=0; j<4; j++){
//                System.out.print(nums [i][j] + " ");
//            }
//
//            System.out.println();
//        }
    }
}