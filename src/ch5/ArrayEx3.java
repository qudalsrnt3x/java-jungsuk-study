package ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 배열 arr에 1~5까지 저장
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        System.out.println("[변경전]");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // 배열 복사
        int[] tmp = new int[arr.length * 2];

        // 배열 arr에 저장된 값들을 배열 tmp에 저장한다.
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp; // tmp에 저장된 값을 arr에 저장한다.

        System.out.println("[변경후]");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
