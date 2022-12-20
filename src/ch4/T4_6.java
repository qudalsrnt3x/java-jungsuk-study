package ch4;

public class T4_6 {
    public static void main(String[] args) {
        // 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프 로그램을 작성하시오.

        for (int i = 1; i <=6; i++){ // 주사위 1
            for (int j = 1; j <=6; j++){ // 주사위 2
                if(i + j == 6) System.out.printf("%d + %d = %d%n", i, j, i + j);
            }
        }
    }
}
