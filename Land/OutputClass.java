package Land;

import java.util.Scanner;

public class OutputClass {

	public static int totalPrice;

	public static PrintClass printClass = null;
	public static CalculateClass calClass = null;
	public static InputClass inputClass = null;
	public Scanner scanner = null;

	public static String ticketSelectStr;

	public OutputClass() {
		printClass = new PrintClass();
		calClass = new CalculateClass();
		inputClass = new InputClass();
		scanner = new Scanner(System.in);
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

	public void ticketSelectString() {
		String ticketSelectStr;
		if (inputClass.getTicketSelect() == 1) {
			ticketSelectStr = "주간권";
		} else if (inputClass.getTicketSelect() == 2) {
			ticketSelectStr = "야간권";
		} else {
			printClass.errorMessage();
		}

	}

}
