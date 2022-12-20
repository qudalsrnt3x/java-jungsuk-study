package ch5;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 정렬 (sort)
        int[] arr = new int[10];

        // 임의의 값 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10); // 0 ~ 9까지 값
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) { // 10개의 값은 9번만 비교해주면 된다.
            boolean changed = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    changed = true;
                }
            }
            if (!changed) break;
        }
    }
}
