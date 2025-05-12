public class sort_2_pointer {
    public static void main(String[] args) {

        System.out.println("hie");
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};                 // init array


        for (int j = 0; j < arr.length; j++)                    // loop to print the elements of the array
            System.out.print(arr[j] + ",");
        System.out.println();

        // logic for the 2 pointers
        // while loop for swapping the elements of array if they are at incorrect position
        //   1, 0, 1, 0, 1, 0, 1, 0, 1, 0
        // left^                          ^right
        //   != 0                        !=1                  swap with right pointer

        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] == 1 && arr[r] == 0) {
                arr[l] = arr[r] + arr[l];
                arr[r] = arr[l] - arr[r];
                arr[l] = arr[l] - arr[r];                       // actual swapping
                l++;
                r--;
            }

            if (arr[l] == 0) {                                 // increasing the index values if not swapping needed
                l++;
                if (arr[r] == 1) r--;
            }
        }

        // finally printing the final sorted array
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + ",");

    }
}
