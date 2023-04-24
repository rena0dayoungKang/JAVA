package Land;

import java.time.LocalDate;
import java.util.Calendar;

public class CalculateClass {

	public static InputClass inputClass = null;
	public static Calendar cal = null;
	public static PrintClass printClass = null;
	public static int currentYear = Calendar.YEAR;
	public static int currentMonth = Calendar.MONTH + 1;
	public static int currentDay = Calendar.DAY_OF_MONTH;
	public static String currentT;
	public static int currentDate;

	public static int internationalAge;
	public static int ageGroup;
	public static int calcAgePrice;

	public static int totalPrice;
	public static int calcPrice;

	public static int[] saveList;
	public static int[] orderList;

	public CalculateClass() {
		saveList = new int[5];
		orderList = new int[100];
		inputClass = new InputClass();
		printClass = new PrintClass();
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

	public static void currentTime() {
		Calendar cal = Calendar.getInstance();
		LocalDate currentDate = LocalDate.now();
		currentYear = cal.get(Calendar.YEAR);
		currentMonth = cal.get(Calendar.MONTH + 1);
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
	}

	public void currentTimes() {
		String cy = String.valueOf(currentYear);
		String cm = String.valueOf(currentMonth);
		String cd = String.valueOf(currentDay);
		String currentT = "currentYear" + "currentMonth" + "currentDay";
	}

	public static void calcAge(long customerIDNumber) {

		customerIDNumber = inputClass.getCustomerIDNumber();

		int customerIDYear, customerIDMonth, customerIDDay, customerIDFlag;
		int age;

		long zeroEleven = ConstValueClass.ZERO_ELEVEN.longValue();
		long zeroNine = ConstValueClass.ZERO_NINE.longValue();

		customerIDYear = (int) (customerIDNumber / zeroEleven);
		customerIDNumber -= customerIDYear * zeroEleven;

		customerIDMonth = (int) (customerIDNumber / zeroNine);
		customerIDNumber -= customerIDMonth * zeroNine;

		customerIDDay = (int) (customerIDNumber / ConstValueClass.ZERO_SEVEN);
		customerIDNumber -= customerIDDay * ConstValueClass.ZERO_SEVEN;

		customerIDFlag = (int) (customerIDNumber / ConstValueClass.ZERO_SIX);

		switch (customerIDFlag) {
		case (ConstValueClass.MALE_OLD):
		case (ConstValueClass.FEMALE_OLD):
			customerIDYear = customerIDYear + ConstValueClass.OLD_GENERATION;
			break;
		default:
			customerIDYear = customerIDYear + ConstValueClass.NEW_GENERATION;
		}

		age = currentYear - customerIDYear + 1;
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
		// 인자가 없어야한다.
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
	}

	public static void calcPriceResult() {
		totalPrice = calcPrice * inputClass.getOrderCount();
		System.out.printf("총 요금은 : %d 입니다", totalPrice);
	}

	public static void saveList() {

//		saveList[0] = 
		// 주야간권
		if (saveList[0] == 1) {
			printClass.dayMessage();
		} else if (saveList[0] == 2) {
			printClass.nightMessage();
		}

		saveList[1] = ageGroup; // 소인~경로
		if (saveList[1] == ConstValueClass.NEW_BORN) {
			printClass.newbornMessage();
		} else if (saveList[1] == ConstValueClass.BABY) {
			printClass.babyMessage();
		} else if (saveList[1] == ConstValueClass.CHILD) {
			printClass.childMessage();
		} else if (saveList[1] == ConstValueClass.TEEN) {
			printClass.teenMessage();
		} else if (saveList[1] == ConstValueClass.ADULT) {
			printClass.adultMessage();
		} else if (saveList[1] == ConstValueClass.OLD) {
			printClass.oldMessage();
		}

		saveList[2] = inputClass.getOrderCount(); // 몇 장 구매
		if (saveList[2] > 0) {
			System.out.printf(" X %d장\t", inputClass.getOrderCount());
		} else {
			printClass.errorMessage();
		}

		saveList[3] = totalPrice; // 총 가격
		if (saveList[3] > 0) {
			System.out.printf("총 금액 : %d 원\t", totalPrice);
		} else {
			printClass.errorMessage();
		}

		saveList[4] = inputClass.getDiscountSelect(); // 할인의 종류
		if (saveList[4] == 1) {
			printClass.orderListIndex1();
		} else if (saveList[4] == 2) {
			printClass.orderListIndex2();
		} else if (saveList[4] == 3) {
			printClass.orderListIndex3();
		} else if (saveList[4] == 4) {
			printClass.orderListIndex4();
		} else if (saveList[4] == 5) {
			printClass.orderListIndex5();
		}

		// System.out.println(Arrays.toString(saveList));

	}

//	public static void orderList() {
//		
//		orderList[]
//		
//	}

}
