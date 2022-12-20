package ch5;

public class T5_1 {
    public static void main(String[] args) {
        //int[] arr[]; // x
        //int[] arr = {1, 2, 3,}; // o

        // int[] arr = new int[5]; // o
        //int[] arr = new int[5]{1, 2, 3, 4, 5}; 5가 들어가면 안됨

        // int arr[5]; // 변수 배열 변수라는 선언만 한 것 초기화는 생성때
        //int[] arr[] = new int[3][]; //o


        // T5_2
        // 답 : 2
        int[][] arr = {
                {5},
                {5},
                {5},
                {30, 30}
        };

        System.out.println(arr[3].length);
    }
}
