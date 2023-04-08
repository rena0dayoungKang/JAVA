package ch02;

public class ch02_02_type {

    public static void main(String[] args) {

        char c = 65; // print 'A'
        System.out.println(c);

//		char d = '65';
//		System.out.println(d);

        char e = 0x0041; // print 'A'
        System.out.println(e);

        char f = 'A'; // print 'A'
        System.out.println(f);

        int g = 'A'; // print 65
        System.out.println(g);

        boolean stop = false;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

//		byte var = 200;
//		long var = 50000000000;
//		float var = 3.14;
//		int var = 1e2;
//		float = 1e2f;
        float var = 1e2f;

        System.out.println(var);

        char c1 = 'a';
        char c2 = (char) (c1 + 1); // 연산의 결과는 int형이여서 char형태로 캐스팅필요
        System.out.println(c2);
    }

}
