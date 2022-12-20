package ch4;

public class T4_7 {
    public static void main(String[] args) {
        // 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
        // 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다.
        // (1)에 알맞은 코드를 넣으시오.

        String str = "12345";
        int sum = 0;

        for(int i=0; i < str.length(); i++) {
            // System.out.println("str.charAt(i) = " + str.charAt(i));
            sum += str.charAt(i) - '0'; // 연산이 일어날 경우 int 형으로 변환
        }
        System.out.println("sum="+sum);
    }
}
