package ch4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 값을 받으면 이진법으로 변환해주는 함수
        //convertDecimalToBinary();
        decimalToBinary();
    }

    private static void convertDecimalToBinary() {
        System.out.println("2진수로 바꾸고 싶은 값을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println(n + "의 2진수 : " + binary);
    }

    private static void decimalToBinary() {
        System.out.println("2진수로 바꾸고 싶은 값을 입력해주세요.");
        List<Integer> binary_num = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // 2로 계속 나눈 나머지를 배열에 저장
        while (number > 0) {

            int num = number % 2;
            binary_num.add(num);
            number /= 2;
        }
        for (int i = binary_num.size() - 1; i >= 0; i--)
            System.out.print(binary_num.get(i));
    }
}
