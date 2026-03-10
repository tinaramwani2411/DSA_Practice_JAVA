package Array;

public class Heighest_element_in_array {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6,7,8};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Heighest element in array is " +max);

//        int min = arr[0];
//        for(int i = 0; i<arr.length; i++){
//            if (arr[i]<min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Smallest element in array is " +min);
    }
}
