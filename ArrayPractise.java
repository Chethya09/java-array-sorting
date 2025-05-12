//  sorted using the single pointer by checking the number of zeros (0) present in the array 


public class ArrayPractise {

    public static void main(String[] args) {
        System.out.println("hie");
        // array inti
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
    //loop to print the original array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
        System.out.println();

        // loop to count number of O's in the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }


        System.out.println("0 are for : " + count + " times ");

        // loop to reinit the array as 0 and 1
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                System.out.println(i + " : " + arr[i]);
                arr[i] = 0;
            } else {
                System.out.println(i + " : " + arr[i]);
                arr[i] = 1;

            }
        }
    // loop to print the final sorted array
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + ",");
    }
}
