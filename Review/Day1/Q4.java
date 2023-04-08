// 한 번 사용한 최초문자
package day1;

import java.util.HashMap;

class Q4 {

	public int solution(String str) {

		HashMap<Character, Integer> hM = new HashMap<>();
		// 키와 값 쌍을 저장하는데 사용한다. 해당 키를 기반으로 값을 빠르게 검색한다.
		// 각 키는 하나의 값에 매핑할 수 있다.
		// get()은 값을 검색할 수 있고, put()은 업데이트에 사용한다.

		for (char x : str.toCharArray()) {
			hM.put(x, hM.getOrDefault(x, 0) + 1);
			// str문자열을 문자 배열로 변환하는 메서드 toCharArray를 순차적으로 char x에 대입
			// str문자열을 한 문자씩 순회하며, 해당 문자가 hM객체에 존재하는지 확인하고,
			// 존재하는경우 문자의 등장횟수를증가시킨다.

			// getOrDefault는 map에서 지정된 키의 값을 반환하는 메소드이다.
			// 만약 해당키에 매핑된 값이 없다면 지정한 default값을 반환한다.
			// hM에 (x, ~~ + 1)의 쌍을 업데이트 한다.
			// hm.getOrDefault(x,0) = x의 값을 반환하고 값이 없다면 디폴트값 0을 반환한다.
		}

		for (int i = 0; i < str.length(); i++) {
			if (hM.get(str.charAt(i)) == 1) {
				// i는 0부터 문자열의 길이까지 1씩증가하면서 반복.
				// 문자열에서 지정된 인덱스에 있는 문자를 반환한 값 str.charAt(i)
				// 객체 hM에서 str문자열의 i번째 문자가 한번만 등장하는 문자인지 확인
				// str문자열을 한 문자씩 순회하며, hM객체에서 해당 문자의 등장횟수를 가져와서 1인지 확인
				// 해당 문자가 한번만 등장한 문자라면 문자의 인덱스를 가져온다
				return i + 1;
				// 가져온 인덱스의 값은 문자열의 인덱스 갑이 0부터 시작하므로 1을 더해준다.
			}

		}
		return -1;
		// str문자열에서 한번만 등장하는 문자가 없을 경우, -1을 반환한다.

	}

	public static void main(String[] args) {
		Q4 T = new Q4();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}
