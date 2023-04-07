//각 문자들의 서로 다른 빈도수 만들기 
//HashMap 에 각 문자의 빈도를 저장 후 반복하고 빈도 값이
//HashSet에 있는지 확인한다.
package day1;

import java.util.HashMap;
import java.util.HashSet;

class Q6 {
	public int solution(String s) {
		int answer = 0; // 모든 문자의 빈도수가 서로 다르도록 하기 위해 지워야 할 최소 개수

		HashMap<Character, Integer> hM = new HashMap<>();
		// HashMap : 키-값 쌍을 저장할 수 있는 클래스
		// keyType, valueType을 지정할 수 있다.
		// HashMap 요소를 추가하려면 put()메서드를 이용한다. hM.put(s, 1)
		// HashMap 요소에 액세스 하려면 get()메서드를 이용한다.
		// HashMap 요소에 대해 반복 : for - each 루프사용하여 반복할 수 있다. 키-값 쌍의 반복

		HashSet<Integer> hS = new HashSet<>();
		// HashSet : 특정 순서 없이 고유한 요소 모음을 저장하는 클래스
		// 정수형 요소가 있는 HashSet 생성
		// HashSet 요소를 추가하려면 add()메서드를 이용한다. hS.add(2)
		// HashSet 요소에 액세스하려면 contains() 메서드를 이용한다. boolean hasApple =
		// hS.contains("apple")
		// HashSet 요소에 대해 반복 : for-each루프를 사용하여 반복
		// HashSet 요소 제거 하려면 remove()메서드를 사용한다.
		// 순서가 지정되지 않은 컬렉션이므로, 요소가 추가한 순서대로 있지는 않는다. 또한 중복 저장이 불가하다.

		for (char x : s.toCharArray()) { // 문자열을 문자 하나씩의 배열의 형태로 변환하여 char x에 순서대로 대입.
			hM.put(x, hM.getOrDefault(x, 0) + 1); // hM에 키-값 쌍을 저장한다. 키는 x(문자한개) - 값은 hM에서 getOrDefault 값에 1을 더한다.
			// a는 몇개 b는 몇개 이렇게 키와 값 쌍을 hashMap에 저장함.
		} // getOrDefault(). hM에서 값을 검색할때 get()메서드를 사용하는데 쌍이 되는 키 값이 없다면 null 을 반환한다.
			// 이를 방지하기 위해 키가 없는 경우 반환할 기본값의 두가지 인수를 취하는 getOrDefault()를 사용할 수 있다.
			// array는 0부터 시작하기 때문에 뒤에 +1을 하여 값을 맞춰준다.

		for (char key : hM.keySet()) { // hashMap에 있는 키의 세트를 불러와서 반복을 한다. char key에 대입하여.
			while (hS.contains(hM.get(key))) { // hashSet의 세트가 hashMap의 key에 해당하는 값을 포함하는지 여부를 확인한다.
				answer++; // 포함한다면 answer변수를 1 증가시킨다.(포함하면 지워야 함)
				hM.put(key, hM.get(key) - 1); // haspMap의 현재 키와 연결된 값을 put()메서드를 사용하여 1씩 감소시켜 업데이트한다.
			}
			if (hM.get(key) == 0) { // hashMap의 key값이 0이라면(현재 문자의 빈도수가 이미 0인경우)
				continue; // 반복을 계속한다.
			}
			hS.add(hM.get(key)); // hS 세트에 hashMap에서 key에 해당하는 값을 추가한다.
		}
		return answer;
	}

	public static void main(String[] args) {
		Q6 T = new Q6();
		System.out.println(T.solution("aaabbbcc"));
		System.out.println(T.solution("aaabbc"));
		System.out.println(T.solution("aebbbbc"));
		System.out.println(T.solution("aaabbbcccde"));
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));
	}
}