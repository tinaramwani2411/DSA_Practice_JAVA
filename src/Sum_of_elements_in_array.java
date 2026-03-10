public class Sum_of_elements_in_array {
    public static void main(String[] args) {
        int arr[] = {23, 45 , 67, 43 , 21};
        int sum = 0;
        for(int i = 1; i < arr.length; i++){
            sum = sum+ arr[i];
        }
        System.out.println("sum of elements in array is: "+arr);
    }
}
