package ch02;

import java.util.Scanner;

public class ch02_04_read {

    public static void main(String[] args) throws Exception {
        int value = 123;
        System.out.printf("%dwon\n", value);
        System.out.printf("%6dwon\n", value);
        System.out.printf("%-6dwon\n", value);
        System.out.printf("%06dwon\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-3s | %3s\n", 1, name, job);
        System.out.printf("%6d | %-3s | %3s\n", 2, name, job);

//		int keyCode;
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);

//		int keyCode;
//		while (true) {
//			keyCode = System.in.read();
//			System.out.println("keyCode: " + keyCode);
//		}

        // system.in.read()
//		int keyCode;
//		while (true) {
//			keyCode = System.in.read();
//			System.out.println("keyCode: " + keyCode);
//			if (keyCode == 113) {
//				break;
//			}
//		}
//		System.out.println("종료");

        // scanner inputData
        Scanner sc = new Scanner(System.in);
        String inputData;

        while (true) {
            inputData = sc.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }
        System.out.println("종료");

    }

}
