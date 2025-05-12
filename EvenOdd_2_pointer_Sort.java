import java.util.Scanner;

public class EvenOdd_2_pointer_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];                                  // taking input from the user in the array
        for (int i = 0; i <= size - 1; i++)
            arr[i] = sc.nextInt();


        System.out.println("the original array is : ");
        for (int i = 0; i <= arr.length - 1; i++)                    // the original array
            System.out.print(arr[i]);
        System.out.println();


        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                arr[left] = arr[left] + arr[right];                 // swapping
                arr[right] = arr[left] - arr[right];
                arr[left] = arr[left] - arr[right];

                left++;                                             // increasing the index
                right--;                                            // decreasing the index
            }
            if (arr[left] % 2 == 0 && arr[right] % 2 == 1) {
                left++;                                             // increasing the index
                right--;                                            // decreasing the index
            }
        }
        System.out.println("the final sorted array is : ");
        for (int i = 0; i <= arr.length - 1; i++)
            System.out.print(arr[i]);                               // final array printing

    }
}

// hint
// Assume this problem as a 0 s and 1 s problem consider the even as a 0's and odd as a 1's