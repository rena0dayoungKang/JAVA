package ch03;

public class ch03_05_CharOperation {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        System.out.println(c1);

        char c2 = 'A';
        //char c3 = c2 + 1; c2변수가 산술연산에 사용되면 int타입으로 변환된다. 연산결과는 int타입이 된다.
        int c3 = c2 + 1;
        System.out.println(c3);

        char c4 = (char) (c2 + 1);
        System.out.println(c4);

    }
}
