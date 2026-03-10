package Array;/* A jagged array, also known as a ragged array
 or array of arrays, is a multi-dimensional data
 structure where each row (sub-array) can have a
 different number of elements. */

public class jagged_array {
    public static void main(String[] args) {

        int arr[][] = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        for(int n[] : arr){
            for(int x : n){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}