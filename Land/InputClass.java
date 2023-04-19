package Land;

import java.util.Scanner;

public class InputClass {

	public static Scanner scanner = new Scanner(System.in);
	public static PrintClass printClass = new PrintClass();
	public static ConstValueClass constValueClass = new ConstValueClass();

	public static int ticketSelect;
	public static int orderCount;
	public static int discountSelect;
	public static long customerIDNumber;

	/**
	 * @return the customerIDNumber
	 */
	public static long getCustomerIDNumber() {
		return customerIDNumber;
	}

	/**
	 * @return the discountSelect
	 */
	public int getDiscountSelect() {
		return discountSelect;
	}

	/**
	 * @return the orderCount
	 */
	public int getOrderCount() {
		return orderCount;
	}

	/**
	 * @return the ticketSelect
	 */
	public int getTicketSelect() {
		return ticketSelect;
	}

	public static void inputTicketSelect() {

		printClass.ticketSelectMessage();

		while (true) {
			ticketSelect = scanner.nextInt();
			if (ticketSelect == 1 || ticketSelect == 2) {
				break;
			} else {
				printClass.errorMessage();
			}
		}
	}

	public static void inputCustomerIDNumber() {

		printClass.juminNumberMessage();

		while (true) {
			customerIDNumber = scanner.nextLong();
			long fullDigit = constValueClass.ZERO_THIRTEEN.longValue();
			long fullDigit_Min = constValueClass.ZERO_TEN.longValue();

			if ((customerIDNumber >= fullDigit_Min) && (customerIDNumber < fullDigit)) {
				break;
			} else {
				printClass.errorMessage();
			}
		}
	}

	public static void inputOrderCount() {

		printClass.orderCountMessage();
		while (true) {
			orderCount = scanner.nextInt();
			if ((orderCount <= ConstValueClass.MAX_COUNT) && (orderCount >= ConstValueClass.MIN_COUNT)) {
				break;
			} else {
				printClass.errorMessage();
			}
		}

	}

	public static void inputDiscountSelect() {

		printClass.discountSelectMessage();

		while (true) {
			discountSelect = scanner.nextInt();
			if (discountSelect >= 1 && discountSelect <= 5) {
				break;
			} else {
				printClass.discountSelectMessage();
			}
		}

	}

}
