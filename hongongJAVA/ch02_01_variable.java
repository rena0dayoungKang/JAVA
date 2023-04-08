package ch02;

public class ch02_01_variable {

    public static void main(String[] args) {
//		int value;								//value 선언 되었으나 초기화 X 컴파일 에러 발생.
//		int result = value + 10;
//		System.out.println(value);

        int value = 30;
        int result = value + 10;
        System.out.println(result);

        int v1 = 15; // 변수는 사용 범위가 제한이 있다.
        int v2 = 0;
        if (v1 > 10) {
            v2 = v1 - 10;
        }
        int v3 = v1 + v2 + 5;
        System.out.println(v3);

        int sum;
        int score1 = 0;
        int score2 = 0;
        sum = score1 + score2;
        System.out.println(sum);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        if (true) {
            if (true) {
                n1 = 1;
                n2 = 1;
                n3 = 1;
            }
            n1 = n2 + n3;
        }
        System.out.println(n1);

    }
}