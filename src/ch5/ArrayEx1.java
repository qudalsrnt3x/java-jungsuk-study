package ch5;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5]; // 길이가 5인 배열
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70;  // score[2] = 70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4]; // 80 + 90

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
        }
        System.out.println("tmp = " + tmp);
        // System.out.println("score[7] = " + score[7]); // index의 범위를 벗어남
    }
}
