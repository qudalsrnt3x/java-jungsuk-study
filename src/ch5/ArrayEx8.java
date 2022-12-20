package ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 섞기 2
        int[] arr = new int[45];

        // 1~45의 값 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // 0번째부터 5번재 요소까지모두 6개만 바꾼다.
        for (int i = 0; i < 6; i++) {
            int n = (int)(Math.random() * 45); // 0 ~ 44
            int tmp = arr[i];
            arr[i] = arr[n];
            arr[n] = tmp;
        }

        // 6개의 요소만 출력
        for (int i = 0; i < 6; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
