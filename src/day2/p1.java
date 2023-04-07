//커피만들기
package day2;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {

		// 1. 변수 설정
		int coffePrice = 2000;
		int wage = 10000 / 60; // 분급
		int coffetime = 3; // 1잔만드는데 3분
		double yield = coffePrice * 0.66; // 커피 한잔당 수익률

		// 2. 사용자로부터 받은 입력값
		Scanner sc = new Scanner(System.in);
		System.out.println("**커피 10잔 구매 시 1잔 on the house!**");
		System.out.println("손님은 커피를 몇잔 주문하시나요?");
		int n = sc.nextInt();

		// 3. 총 무료커피 수, 지불금액, 순수익 계산
		int freeCoffee = n / 10;
		int coffeSumPrice = coffePrice * (n - freeCoffee);
		double netprofit = (yield * n) - (wage * 3 * n);

		// 4. 출력단
		System.out.println("제공되는 무료 커피의 갯수는? " + freeCoffee);
		System.out.println("지불금액: " + coffeSumPrice);
		System.out.println("순 수익:  " + (coffeSumPrice - netprofit));
		System.out.println("손님의 예상대기시간은? " + (coffetime * n) + "분");
	}

}
