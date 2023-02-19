package search;

import java.util.Scanner;

public class Linear {
    // int arr[] = { 5, 3, 8, 1, 9, 4, 10, 2, 7, 6 };
    int arr[] = { 15, 11, 1, 3, 8 };
    int result;

    private int search(int input) {
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) {
                result = i;
                break;
            } else {
                result = -1;
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Linear linear = new Linear();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        int result = linear.search(input);

        if (result == -1) {
            System.out.println("존재하지 않는 값입니다.");
        } else {
            System.out.println(result + "번 인덱스 값입니다.");
        }
    }
}
