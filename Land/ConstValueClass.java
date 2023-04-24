package Land;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConstValueClass {

	public static final int NEW_BORN_PRICE = 0;
	public static final int BABY_DAY_PRICE = 15000;
	public static final int BABY_NIGHT_PRICE = 15000;
	public static final int ADULT_DAY_PRICE = 62000;
	public static final int ADULT_NIGHT_PRICE = 50000;
	public static final int TEEN_DAY_PRICE = 54000;
	public static final int TEEN_NIGHT_PRICE = 43000;
	public static final int CHILD_DAY_PRICE = 47000;
	public static final int CHILD_NIGHT_PRICE = 36000;
	public static final int OLD_DAY_PRICE = 47000;
	public static final int OLD_NIGHT_PRICE = 36000;

	public static final BigDecimal ZERO_THIRTEEN = new BigDecimal("10000000000000");
	public static final BigDecimal ZERO_ELEVEN = new BigDecimal("100000000000");
	public static final BigDecimal ZERO_TEN = new BigDecimal("10000000000");
	public static final BigDecimal ZERO_NINE = new BigDecimal("1000000000");
	public static final long ZERO_SEVEN = 10000000;
	public static final long ZERO_SIX = 1000000;

	public static final int TWO_DIGIT = 100;
	public static final int ONE_DIGIT = 10;
	public static final int OLD_GENERATION = 1900;
	public static final int NEW_GENERATION = 2000;
	public static final int MALE_OLD = 1;
	public static final int FEMALE_OLD = 2;
	public static final int MALE_NEW = 3;
	public static final int FEMALE_NEW = 4;
	public static final int BEFORE_BIRTH = 2;
	public static final int AFTER_BIRTH = 1;

	public static final int MIN_BABY = 1;
	public static final int MIN_CHILD = 3;
	public static final int MAX_CHILD = 12;
	public static final int MIN_TEEN = 13;
	public static final int MAX_TEEN = 18;
	public static final int MIN_ADULT = 19;
	public static final int MAX_ADULT = 64;

	public static final int NEW_BORN = 0;
	public static final int BABY = 1;
	public static final int CHILD = 2;
	public static final int TEEN = 3;
	public static final int ADULT = 4;
	public static final int OLD = 5;

	public static final double DISABLE_DISCOUNT_RATE = 0.5;
	public static final double NATIONAL_MERIT_DISCOUNT_RATE = 0.5;
	public static final double MULTICHILD_DISCOUNT_RATE = 0.7;
	public static final double PREGNANT_DISCOUNT_RATE = 0.5;

	public static final int MAX_COUNT = 10;
	public static final int MIN_COUNT = 1;

	public static LocalDate currentDate = LocalDate.now();

}
