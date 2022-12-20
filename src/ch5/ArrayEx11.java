package ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        // 빈도수 구하기
        int[] arr = new int[10];
        int[] counter = new int[10];

        // 0 ~9 임의의 수 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "의 개수 : "+ counter[i]);
        }
    }
}
