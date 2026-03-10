package Array;

public class Find_even_odd_from_Array {
    public static void main(String[] args) {
        int arr[] ={ 2, 3, 4, 5, 6, 7, 8};
        int counteven = 0;
        int countodd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        int arreven[] = new int [counteven];
        int arrodd[] = new int [countodd];
        int evenindex = 0;
        int oddindex= 0;

        for (int i = 0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                arreven[evenindex] = arr[i];
                evenindex++;
            }
            else{
                arrodd[oddindex] = arr[i];
                oddindex++;
            }
        }
        System.out.println("printing the Even Array....");
        for(int i= 0; i<arreven.length; i++){
            System.out.print(arreven[i]);
        }
        System.out.println();
        System.out.println("printing the Odd Array....");
        for(int i= 0; i<arrodd.length; i++){
            System.out.print(arrodd[i]);
        }
    }
}
