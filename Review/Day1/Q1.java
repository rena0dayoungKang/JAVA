// 사다리타기
package day1;

import java.util.Arrays;

class Q1 {

	public char[] solution(int n, int[][] ladder) { //
		char[] answer = new char[n]; // char형식의 배열을 만들고 길이를 n으로 정한다.

		for (int i = 0; i < n; i++) { // i는 0부터 n(사람수로 본다)까지 1씩 올라가면서
			answer[i] = (char) (i + 65); // 사람이름 ABCDE를 answer배열에 대입한다. (A는 숫자로 65)
		}

		for (int[] line : ladder) { // for-each문법. ladder배열의 각 요소값을 순차적으로 line에 전달한다.
			for (int x : line) { // line배열의 각 요소값을 순차적으로 x에 전달한다.
				char tmp = answer[x]; // answer배열의 x번째 값을 tmp라는 변수에 char형식으로 대입한다.
				answer[x] = answer[x - 1]; // answer배열의 x번째 값은 x-1번째 값과 swap된다.
				answer[x - 1] = tmp; // answer배열의 x-1번째 값을 tmp에 대입한다.
			}
		}
		return answer; // answer값을 리턴한다.
	}

	public static void main(String[] args) {

		Q1 T = new Q1(); // q1 클래스에서
		System.out.println(Arrays.toString(T.solution(5, new int[][] { { 1, 3 }, { 2, 4 }, { 1, 4 } })));
		// 사람이 5명일때, 사다리타기의 가로줄은 1번과 3번에서 가로줄, 2번과 4번에서 가로줄, 1번과 4번에서 가로줄이 생긴다
		System.out.println(Arrays.toString(T.solution(7, new int[][] { { 1, 3, 5 }, { 1, 3, 6 }, { 2, 4 } })));
		// 사람이 7명일때 사다리타기의 가로줄을 1번과 3번 5번에서 가로줄, 1번과 3번과 6번에서 가로줄, 2번과 4번에서 가로줄이생긴다
		System.out.println(
				Arrays.toString(T.solution(8, new int[][] { { 1, 5 }, { 2, 4, 7 }, { 1, 5, 7 }, { 2, 5, 7 } })));
		// 사람이 8명일때 사다리타기의 가로줄을 1번과 5번에서 가로줄, 2번과 4번 7번에서 가로줄, 1번과 5번과 7번에서 가로줄, 2번과 5번과
		// 7번에서 가로줄이 생긴다.
		System.out.println(Arrays.toString(T.solution(12,
				new int[][] { { 1, 5, 8, 10 }, { 2, 4, 7 }, { 1, 5, 7, 9, 11 }, { 2, 5, 7, 10 }, { 3, 6, 8, 11 } })));
	}
}
