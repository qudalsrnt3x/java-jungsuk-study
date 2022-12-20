package ch2;

public class Exercise2_8 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        // 문제풀이
        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.printf("%s %s", x, y);

        // x=2 y=3 z=1

        char ch = 65;
        System.out.println(ch);
    }
}
