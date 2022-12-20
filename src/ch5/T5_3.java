package ch5;

import java.util.Arrays;

public class T5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // 합을 구하시오
        //sum = Arrays.stream(arr).sum();
        for (int i : arr) sum += i;

        System.out.println("sum = " + sum);
    }
}
