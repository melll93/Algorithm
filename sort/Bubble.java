package sort;

public class Bubble {
    public static void main(String[] args) {

        int arr[] = { 5, 3, 8, 1, 9, 4, 10, 2, 7, 6 };

        int temp;
        for (int i = 0; i < arr.length; i++) { // 1번 for문
            for (int j = i; j < arr.length; j++) {// 2번 for 문
                if (arr[i] > arr[j]) {
                    temp = arr[j]; // 배열의 값 중 제일 작은 값을 저장한다.
                    arr[j] = arr[i]; // 해당 값의 index를 저장한다.
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}