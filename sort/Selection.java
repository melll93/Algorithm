package sort;

public class Selection {

    public static void main(String[] args) {
        int index = 0;
        int temp;
        int min;
        // int arr[] = { 5, 3, 8, 1, 9, 4, 10, 2, 7, 6 };
        int arr[] = { 15, 11, 1, 3, 8 };
        for (int i = 0; i < arr.length; i++) {
            min = 100;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
