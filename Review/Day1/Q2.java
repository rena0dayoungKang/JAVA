//청소기로봇
package day1;

import java.util.Arrays;

class Q2 {

	public int[] solution(int[][] board, int k) { // 방의 크기, 시간
		int[] answer = new int[2]; // answer의 배열에 정수형 변수 2개가 들어간다.

		// 1. board의 크기 계산
		// 2. 로봇의 방향 설정
		// 3. 사용할 변수 (로봇위치, 시간, 방향) 변수 초기화
		// 4. 반복문 - 방향설정(key) -> 한칸이동 or 방향변경 + 시간
		// 5. if k 값이 미지수 x보다 크다면 break

		// 1. board의 크기 계산
		int n = board.length;
		// 2. 로봇의 방향을 설정
		// 좌표값을 행렬로 따졌을때, x는 가로축 y는 세로축으로 본다.
		// (초기 값은 오른쪽을 보고 있으므로, dxdy칼럼 (0,1,2,3) 중 1번재 칼럼이다.
		int[] dx = { -1, 0, 1, 0 }; // (-1,0)은 12시, (0,1)은 3시 (1,0)은 6시 (0, -1)은9시로 움직인다, 각각의 칼럼번호가 d의 값.
		int[] dy = { 0, 1, 0, -1 }; // dx dy의 좌표 = d
		// 3. 사용할 변수 초기화.
		int x = 0, y = 0, d = 1, count = 0; // 로봇은 처음에 (0,0) 칸에서 오른쪽을 보면서 시작한다. 시작 시간은 0초
		// 4. 반복문 - 방향설정
		while (count < k) { // 반복문 while로 k가 되기전까지 count센다. (몇 초인지)
			count++; // 1초씩 증가하는 개념
			int nx = x + dx[d]; // 로봇의 x좌표 = 기존의 x좌표값에 dx배열의 칼럼번호 d를 더해서 움직인다.
			int ny = y + dy[d]; // 로봇의 y좌표 = 기존의 y좌표값에 dy배열의 칼럼번호 d를 더해서 움직인다.
			if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) { // x좌표값이 0보다 작거나, board의 크기 이상이거나,
				// y좌표값이 0보다 작거나, y좌표값이 board 크기(n)이상이거나 board 내의 좌표값이 1이면(장애물이 있으면)

				d = (d + 1) % 4; // 방향을 바꾸는 것. d가 방향설정 칼럼이고 d에 0,1,2,3을 차례로 넣는다. d가 3이면 (3 + 1) %4 해서 다시 0으로
									// 돌아간다.
				// (90도씩 방향설정하는 부분) dxdy (-1,0)인 방향으로 돌아간다.
				continue; // count가 k가 될때까지 while문을 반복한다.
			}
			x = nx; // x의좌표값은 x에 대입
			y = ny; // y의좌표값은 y에 대입

		}
		answer[0] = x; // x의 값은 answer배열의 0번째 값으로 대입.
		answer[1] = y; // y의 값은 answer배열의 1번째 값으로 대입.
		return answer; //
	}

	public static void main(String[] args) {
		Q2 T = new Q2();
		int[][] arr1 = { { 0, 0, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0 } }; // board의 크기 계산, 시간설정
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = { { 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1 }, { 1, 1, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = { { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T.solution(arr3, 25)));

	}
}
