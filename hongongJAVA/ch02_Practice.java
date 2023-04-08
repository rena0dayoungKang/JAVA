package ch02;

import java.util.Scanner;

public class ch02_Practice {

    public static void main(String[] args) {
        // 1.
//		String name = "감자바";
//		int age = 25;
//		String tel1 = "010", tel2 = "123", tel3 = "4567";
//		System.out.println("이름 : " + name + "\n" + "나이 : " + age + "\n" + "전화 : " + tel1 + "-" + tel2 + "-" + tel3);
//		System.out
//				.print("이름 : " + name + "\n" + "나이 : " + age + "\n" + "전화 : " + tel1 + "-" + tel2 + "-" + tel3 + "\n");
//		System.out.printf("이름 : %s\n나이 : %d\n전화 : %s - %s - %s", name, age, tel1, tel2, tel3);

        // 2.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 수: ");
//		String strNum1 = sc.nextLine();
//		System.out.println("두번째 수: ");
//		String strNum2 = sc.nextLine();
//
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		int result = num1 + num2;
//		System.out.println("덧셈결과 : " + result);

        // 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("[필수 정보 입력]\n");
        System.out.println("1. 이름 :  ");
        String name = sc.nextLine();
        System.out.println("2. 주민번호 앞 6자리 :  ");
        String numbers = sc.nextLine();
        System.out.println("3. 전화번호 :  ");
        String tel = sc.nextLine();
        System.out.println();

        System.out.println("[입력한 내용]");
        System.out.println("1. 이름 : " + name);
        System.out.println("2. 주민번호 앞 6자리 : " + numbers);
        System.out.print("3. 전화번호 : " + tel);

    }

}
