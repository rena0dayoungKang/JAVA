package Land;

public class PrintClass {

	public void errorMessage() {
		System.out.println("잘못 입력하셨습니다.\n");
	}

	public void ticketSelectMessage() {
		System.out.println("권종을 선택하세요. \n");
		System.out.println("1. 주간권\n");
		System.out.println("2. 야간권\n");
	}

	public void juminNumberMessage() {
		System.out.println("주민등록번호를 입력하세요 \n");
	}

	public void discountSelectMessage() {
		System.out.println("우대사항을 선택하세요.\n");
		System.out.println("1. 없음(나이 우대는 자동처리)\n");
		System.out.println("2. 장애인\n");
		System.out.println("3. 국가유공자\n");
		System.out.println("4. 다자녀\n");
		System.out.println("5. 임신부\n");
	}

	public void orderCountMessage() {
		System.out.println("몇개를 구매하시겠습니까? (최대 10개) \n");
	}

	public void orderPrintMessage() {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println();
		System.out.println("================================에버랜드===================================\n");

	}

	public void dayMessage() {

		System.out.print("주간권  ");
	}

	public void nightMessage() {
		System.out.print("야간권  ");
	}

	public void newbornMessage() {
		System.out.print("신생아  ");
	}

	public void babyMessage() {
		System.out.print("베이비  ");
	}

	public void childMessage() {
		System.out.print("어린이  ");
	}

	public void teenMessage() {
		System.out.print("청소년  ");
	}

	public void adultMessage() {
		System.out.print("성인  ");
	}

	public void oldMessage() {
		System.out.print("경로  ");
	}

	public void orderListIndex1() {
		System.out.print("*우대적용 없음 ");
	}

	public void orderListIndex2() {
		System.out.print("*장애인 우대적용 ");
	}

	public void orderListIndex3() {
		System.out.print("*국가유공자 우대적용 ");
	}

	public void orderListIndex4() {
		System.out.print("*다자녀 우대적용 ");
	}

	public void orderListIndex5() {
		System.out.print("*임신부 우대적용 ");
	}

	public void totalPriceMessage(int priceResult) {
		System.out.println();
		System.out.printf("입장료 총액은 %d원 입니다. \n", priceResult);
		System.out.println(
				"==================================================================================================\n");
		System.out.println();
	}

	public void orderContinueMessage() {
		System.out.println("계속 발권 하시겠습니까? \n");
		System.out.println("1. 티켓 발권 \n");
		System.out.println("2. 종료 \n");
	}

	public void orderListPrint() {

		System.out.println(
				"==================================================================================================\n");
		System.out.printf("%");

	}

}
