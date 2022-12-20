package ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 섞기 (shuffle)
        int[] numArr = new int[10];

        // 0~9 초기화
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 1;
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10); // 0 ~ 9 랜덤
            // 배열의 임의의 위치에 있는 값과 배열의 첫번째 요소의 값을 교환한다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp; // 스왑
        }

        System.out.println(Arrays.toString(numArr));
    }
}
