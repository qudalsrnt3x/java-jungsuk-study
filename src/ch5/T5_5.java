package ch5;

import java.util.Arrays;

public class T5_5 {
    public static void main(String[] args) {
        // 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
        // (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
        // ([참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.)

        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            //0.0이상 1.0 미만 사이의 값을 반환하는 함수 * 9
            // 0.xxxxx ~ 9.xxxx 까지
            // int로 형변환 -> 0~9까지 반환

            int tmp = 0; // 자리를 바꾸기 위해 tmp 변수 하나 생성

            tmp = ballArr[i]; // tmp에 i번째에 해당하는 값을 저장
            ballArr[i] = ballArr[j]; // i번째에 해당하는 값을 j번째에 해당하는 값으로 저장
            ballArr[j] = tmp; // j번째에 해당하는 값을 tmp로 저장

        }
        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        /* (2) */
        ball3 = Arrays.copyOfRange(ballArr, 0, 3); // 0번째부터 3미만까지

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}
