package Land;

import java.util.Scanner;

public class LandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputClass inputClass = new InputClass();
		CalculateClass calClass = new CalculateClass();
		OutputClass outputClass = new OutputClass();
		PrintClass printClass = new PrintClass();
		OrderList orderClass = new OrderList();
		ListSaving listSaving = new ListSaving();

		int isExit;
		long customerIDNumer = 0;
		int internationalAge = 0;
		int ageGroup = 0;
		int ticketSelect = 0;
		int discountSelect = 0;
		int calcPrice = 0;
		int orderCount = 0;
		int totalPrice = 0;

		do {

			inputClass.inputTicketSelect();
			inputClass.inputCustomerIDNumber();
			inputClass.inputOrderCount();
			inputClass.inputDiscountSelect();

			calClass.currentTime();
			calClass.calcAge(customerIDNumer);
			calClass.calcAgeGroup();
			calClass.calcDiscount();
			calClass.calcPriceResult();

			System.out.println("\n계속 진행 (1. 새로운 주문   2.프로그램 종료) :  ");
			Scanner sc = new Scanner(System.in);
			isExit = sc.nextInt();

		} while (isExit == 1);

		System.out.println("프로그램 종료");
		listSaving.OrderList(orderClass.getCurrentT(), ticketSelect, ageGroup, orderCount, totalPrice, discountSelect);
		printClass.orderPrintMessage();
		calClass.saveList();

	}
}
