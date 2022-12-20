package ch5;

public class T5_4 {
    public static void main(String[] args) {
        // 모든 값의 총합과 평균을 구하라
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        for (int[] ints : arr) {
            for (int i : ints) {
                total += i;
            }
        }

        average = (float)total / (arr.length * arr[0].length);

        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
