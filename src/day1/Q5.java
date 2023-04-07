// 같은 빈도수 만들기
package day1;

import java.util.Arrays;
import java.util.HashMap;

class Q5 {

	public int[] solution(String str) {
		int[] answer = new int[5]; // int형 배열을 answer로 선언하고 배열길이 5로 설정함.

		HashMap<Character, Integer> hM = new HashMap<>(); // hashMap (문자형, 정수형) 객체 생성

		for (char x : str.toCharArray()) {
			hM.put(x, hM.getOrDefault(x, 0) + 1);
			// str문자열을 문자배열으로 변경하여 char x에 대입
			// str문자열을 한개의 문자씩 순회하면서, 해당 객체가 hM에 있는지 확인하고,
			// 존재하는 경우 문자의 등장횟수를 증가시킨다.

			// getOrDefault는 map에서 지정된 키를 반환하는 함수
			// 만약 해당키에 매핑된 값이 없다면 디폴트값을 반환(0)

		}
		int max = Integer.MIN_VALUE;
		// max라는 변수에 int형 변수가 가질 수 있는 가장 작은 값을 초기값 설정.
		String tmp = "abcde";
		// string형 tmp변수에 문자열 입력

		for (char key : tmp.toCharArray()) {
			if (hM.getOrDefault(key, 0) > max) {
				max = hM.getOrDefault(key, 0);
			}
			// tmp문자열을 문자의 배열형태로 변환하여 key 라는 변수에 순차적으로 대입
			// 만약 hM에서 가져온 문자의 값이 max 변수의 현재 값보다 크다면 max값을 해당 값으로 갱신
			// tmp문자열에서 가장 많이 나타난 문자의 갯수를 찾아서 그 값으로 업데이트
		}

		for (int i = 0; i < tmp.length(); i++) {
			answer[i] = max - hM.getOrDefault(tmp.charAt(i), 0);
		}
		// tmp문자열의 모든 문자를 하나씩 가져와서 hM 에서 해당 문자의 값을 찾는다.
		// 갖고온 값이 max 값과 같다면, tmp문자열에서 가장 많이 나타난 문자이므로 answer배열에 0
		// max와 다른 경우, tmp문자열에서 가장 많이 나타난 문자의 갯수와 해당 문자가 나타난 횟수의 차이 계산
		// answer배열의 해당 인덱스에 할당.

		return answer;

	}

	public static void main(String[] args) {
		Q5 T = new Q5();

		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}