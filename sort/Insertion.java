package sort;

public class Insertion {
    public static void main(String[] args) {
        int j = 0;
        // int arr[] = { 5, 3, 8, 1, 9, 4, 10, 2, 7, 6 };
        int arr[] = { 15, 11, 1, 3, 8 };
        for (int i = 1; i < arr.length; i++) {
            int pick = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > pick; j--) {
                arr[j + 1] = arr[j]; // arr[j]가 더 크면 한 칸 뒤로,
            }
            arr[j + 1] = pick;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
