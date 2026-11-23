public class ReverseArray {

    public static void reverseArray(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50}; 
        

        System.out.println("Original array:");
        displayArray(numbers);

        reverseArray(numbers, 0, numbers.length - 1);
        System.out.println();


        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}
