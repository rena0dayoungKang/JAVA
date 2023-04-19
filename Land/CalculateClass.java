package Land;

import java.time.LocalDate;
import java.util.Calendar;

public class CalculateClass {

	public static InputClass inputClass = null;
	public static Calendar cal = null;
	public static int currentYear = Calendar.YEAR;
	public static int currentMonth = Calendar.MONTH + 1;
	public static int currentDay = Calendar.DAY_OF_MONTH;

	public static int internationalAge;
	public static int ageGroup;
	public static int calcAgePrice;

	public static int totalPrice;
	public static int calcPrice;

	public int[] save;
	public int[][] orderList;

	public CalculateClass() {
		save = new int[5];
		orderList = new int[100][5];
		inputClass = new InputClass();
	}

	/**
	 * @return the internationalAge
	 */
	public static int getInternationalAge() {
		return internationalAge;
	}

	/**
	 * @return the ageGroup
	 */
	public static int getAgeGroup() {
		return ageGroup;
	}

	/**
	 * @return the calcPrice
	 */
	public int getCalcPrice() {
		return calcPrice;
	}

	/**
	 * @return the totalPrice
	 */
	public int getTotalPrice() {

		return totalPrice;
	}

	/**
	 * @return the orderList
	 */
	public int[][] getOrderList() {
		return orderList;
	}

	/**
	 * @return the save
	 */
	public int[] getSave() {
		return save;
	}

	public static void currentTime() {
		Calendar cal = Calendar.getInstance();
		LocalDate currentDate = LocalDate.now();
		currentYear = cal.get(Calendar.YEAR);
		currentMonth = cal.get(Calendar.MONTH + 1);
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
	}

	public static void calcAge(long customerIDNumber) {

		customerIDNumber = inputClass.getCustomerIDNumber();

		int customerIDYear, customerIDMonth, customerIDDay, customerIDFlag;
		int age;

		long zeroEleven = ConstValueClass.ZERO_ELEVEN.longValue();
		long zeroNine = ConstValueClass.ZERO_NINE.longValue();

		customerIDYear = (int) (customerIDNumber / zeroEleven);
		// System.out.println(customerIDYear);
		customerIDNumber -= customerIDYear * zeroEleven;

		customerIDMonth = (int) (customerIDNumber / zeroNine);
		// System.out.println(customerIDMonth);
		customerIDNumber -= customerIDMonth * zeroNine;

		customerIDDay = (int) (customerIDNumber / ConstValueClass.ZERO_SEVEN);
		// System.out.println(customerIDDay);
		customerIDNumber -= customerIDDay * ConstValueClass.ZERO_SEVEN;

		customerIDFlag = (int) (customerIDNumber / ConstValueClass.ZERO_SIX);
		// System.out.println(customerIDFlag);

		switch (customerIDFlag) {
		case (ConstValueClass.MALE_OLD):
		case (ConstValueClass.FEMALE_OLD):
			customerIDYear = customerIDYear + ConstValueClass.OLD_GENERATION;
			break;
		default:
			customerIDYear = customerIDYear + ConstValueClass.NEW_GENERATION;
		}

		age = currentYear - customerIDYear + 1;
		// System.out.println(currentYear);
		// System.out.println(customerIDYear);
		// System.out.println(age);
		if (customerIDMonth > currentMonth) {
			internationalAge = age - ConstValueClass.BEFORE_BIRTH;
		} else if ((customerIDMonth == currentMonth) && (customerIDDay < currentDay)) {
			internationalAge = age - ConstValueClass.BEFORE_BIRTH;
		} else {
			internationalAge = age - ConstValueClass.AFTER_BIRTH;
		}

		System.out.printf("만나이는 %d입니다\n", internationalAge);
	}

	public static void calcAgeGroup() {
		// 인자가 없어야한다....
		// System.out.println(internationalAge);
		if (internationalAge < ConstValueClass.MIN_CHILD) {
			ageGroup = ConstValueClass.BABY;
			if (inputClass.getTicketSelect() == 1) {
				calcAgePrice = ConstValueClass.BABY_DAY_PRICE;
			} else if (inputClass.getTicketSelect() == 2) {
				calcAgePrice = ConstValueClass.BABY_NIGHT_PRICE;
			}

		} else if ((internationalAge >= ConstValueClass.MIN_CHILD) && (internationalAge <= ConstValueClass.MAX_CHILD)) {
			ageGroup = ConstValueClass.CHILD;
			if (inputClass.getTicketSelect() == 1) {
				calcAgePrice = ConstValueClass.CHILD_DAY_PRICE;
			} else if (inputClass.getTicketSelect() == 2) {
				calcAgePrice = ConstValueClass.CHILD_NIGHT_PRICE;
			}

		} else if ((internationalAge >= ConstValueClass.MIN_TEEN) && (internationalAge <= ConstValueClass.MAX_TEEN)) {
			ageGroup = ConstValueClass.TEEN;
			if (inputClass.getTicketSelect() == 1) {
				calcAgePrice = ConstValueClass.TEEN_DAY_PRICE;
			} else if (inputClass.getTicketSelect() == 2) {
				calcAgePrice = ConstValueClass.TEEN_NIGHT_PRICE;
			}

		} else if ((internationalAge >= ConstValueClass.MIN_ADULT) && (internationalAge <= ConstValueClass.MAX_ADULT)) {
			ageGroup = ConstValueClass.ADULT;
			if (inputClass.getTicketSelect() == 1) {
				calcAgePrice = ConstValueClass.ADULT_DAY_PRICE;
			} else if (inputClass.getTicketSelect() == 2) {
				calcAgePrice = ConstValueClass.ADULT_NIGHT_PRICE;
			}

		} else if (internationalAge > ConstValueClass.MAX_ADULT) {
			ageGroup = ConstValueClass.OLD;
			if (inputClass.getTicketSelect() == 1) {
				calcAgePrice = ConstValueClass.OLD_DAY_PRICE;
			} else if (inputClass.getTicketSelect() == 2) {
				calcAgePrice = ConstValueClass.OLD_NIGHT_PRICE;
			}

		} else {
			ageGroup = 0;
		}
	}

	public static void calcDiscount() {
		int discountSelect = inputClass.getDiscountSelect();
		switch (discountSelect) {
		case 1:
			calcPrice = calcAgePrice;
			break;
		case 2:
			calcPrice = (int) (calcAgePrice * ConstValueClass.DISABLE_DISCOUNT_RATE);
			break;
		case 3:
			calcPrice = (int) (calcAgePrice * ConstValueClass.NATIONAL_MERIT_DISCOUNT_RATE);
			break;
		case 4:
			calcPrice = (int) (calcAgePrice * ConstValueClass.MULTICHILD_DISCOUNT_RATE);
			break;
		case 5:
			calcPrice = (int) (calcAgePrice * ConstValueClass.PREGNANT_DISCOUNT_RATE);
			break;
		default:
			break;
		}
		// System.out.println(calcPrice);
	}

	public static void calcPriceResult() {
		totalPrice = calcPrice * inputClass.getOrderCount();
		System.out.printf("총 요금은 : %d 입니다", totalPrice);
	}

//	public void saveOrderList(int ticketSelect, int internationalAge, int orderCount, int priceResult,
//			int discountSelect, int[] save, int[][] orderList) {
//		orderList[save[0]][0] = ticketSelect;
//		orderList[save[0]][1] = internationalAge;
//		orderList[save[0]][2] = orderCount;
//		orderList[save[0]][3] = priceResult;
//		orderList[save[0]][4] = discountSelect;
//		save[0]++;
//	}

}
