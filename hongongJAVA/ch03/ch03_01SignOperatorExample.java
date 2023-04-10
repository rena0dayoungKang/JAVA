package ch03;

public class ch03_01SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        //byte result3 = -b; byte값을 부호연산하면 int타입으로 바뀌게 된다.
        int result3 = -b;
        System.out.println("result3=" + result3);


    }
}
