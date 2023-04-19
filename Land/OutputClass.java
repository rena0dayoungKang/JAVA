package Land;

import java.util.Scanner;

public class OutputClass {

	public static int totalPrice;

	public static PrintClass printClass = null;
	public static CalculateClass calClass = null;
	public static InputClass inputClass = null;
	public Scanner scanner = null;

	public OutputClass() {
		printClass = new PrintClass();
		calClass = new CalculateClass();
		inputClass = new InputClass();
		scanner = new Scanner(System.in);
	}

	public void outputOrder() {
		printClass.orderPrintMessage();

		int[] save = calClass.getSave();
		int[][] orderList = calClass.getOrderList();

		int i = 0;
		for (i = 0; i < save[i]; i++) {
			switch (orderList[i][0]) {
			case 1:
				printClass.dayMessage();
				break;
			case 2:
				printClass.nightMessage();
				break;
			default:
				break;
			}

			if (calClass.calcAgeGroup(orderList[i][1]) == ConstValueClass.NEW_BORN) {
				printClass.newbornMessage();
			} else if (calClass.calcAgeGroup(orderList[i][1]) == ConstValueClass.BABY) {
				printClass.babyMessage();
			} else if (calClass.calcAgeGroup(orderList[i][1]) == ConstValueClass.CHILD) {
				printClass.childMessage();
			} else if (calClass.calcAgeGroup(orderList[i][1]) == ConstValueClass.TEEN) {
				printClass.teenMessage();
			} else if (calClass.calcAgeGroup(orderList[i][1]) == ConstValueClass.ADULT) {
				printClass.adultMessage();
			} else if (calClass.calcAgeGroup(orderList[i][1]) == ConstValueClass.OLD) {
				printClass.oldMessage();
			}

			System.out.printf("X %3d ", orderList[i][2]);
			System.out.printf("%8d원    ", orderList[i][3]);

			switch (orderList[i][4]) {
			case 1:
				printClass.orderListIndex1();
				break;
			case 2:
				printClass.orderListIndex2();
				break;
			case 3:
				printClass.orderListIndex3();
				break;
			case 4:
				printClass.orderListIndex4();
				break;
			case 5:
				printClass.orderListIndex5();
				break;
			default:
				break;
			}
		}

		printClass.totalPriceMessage(totalPrice);

	}

	public int outputOrderContinue() {
		int continueSelect = 0;

		printClass.orderContinueMessage();

		while (true) {
			continueSelect = scanner.nextInt();
			if (continueSelect == 1) {
				continue;
			} else if (continueSelect == 2) {
				break;
			} else {
				printClass.errorMessage();
			}
		}
		return continueSelect;
	}

}
