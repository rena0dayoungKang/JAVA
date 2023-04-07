//커피만들기
package pkg01;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {

		int coffePrice = 2000;
		int wage = 10000 / 60;
		int coffetime = 3;
		double yield = coffePrice * 0.66;

		Scanner sc = new Scanner(System.in);
		System.out.println("손님은 커피를 몇잔 주문하시나요?");
		int n = sc.nextInt();

		double netprofit = (yield * n) - (wage * 3 * n);
		int freeCoffee = n % 10 + 1;
		int coffeSumPrice = coffePrice * (n - freeCoffee);

		if (n >= 10) {
			System.out.println("제공되는 무료 커피의 갯수는? " + freeCoffee);
		}
		System.out.println("지불금액: " + coffeSumPrice);
		System.out.println("순 수익:  " + (coffeSumPrice - netprofit));
		System.out.println("손님의 예상대기시간은? " + (coffetime * n) + "분");
	}

}
