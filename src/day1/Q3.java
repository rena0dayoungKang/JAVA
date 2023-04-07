// 잃어버린 강아지.
package day1;

class Q3 {

	public int solution(int[][] board) { // board의 크기 행렬값의 정수배열이다
		// 왜 for두번 돌아요? 좌표가 돌면서 x 와 y의 좌표값을 받아와야 해서

		// 1. board의 크기 정의
		int n = board.length;

		// 2. 현수의 위치와 방향 설정
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 }; // (-1,0)12시방향, (0,1)3시시방향, (1,0)6시방향, (0,-1)9시방향

		// 3.
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		// 4.
		for (int i = 0; i < n; i++) { // 1이 나무, 2가 현수, 3이 강아지
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 2) { // 현수의 좌표를 생각해보자
					x1 = i; // 현수의 처음 x좌표
					y1 = j; // 현수의 처음 y좌표
				}
				if (board[i][j] == 3) {
					x2 = i; // 강아지의 처음 x좌표
					y2 = j; // 강아지의 처음 y좌표
				}
			}
		}

		// 5.
		int time = 0, d1 = 0, d2 = 0;
		while (time < 10000) { // 10,000분 후에도 찾을 수 없으면 0을 반환해야한다
			time++; // 시간은 1분씩 증가한다.
			int nx1 = x1 + dx[d1]; // 현수의 x좌표 : 처음의 x좌표에서 dx
			int ny1 = y1 + dy[d1];
			int nx2 = x2 + dx[d2];
			int ny2 = y2 + dy[d2];

			boolean flag1 = true, flag2 = true;
			if (nx1 < 0 || nx1 >= n || ny1 < 0 || ny1 >= n || board[nx1][ny1] == 1) { // 현수의 x , y좌표가 0미만이거나,
																						// n(땅의크기)이상이거나,
				// 보드내의 좌표에 1이 있으면 장애물이므로 방향전환해야함.
				d1 = (d1 + 1) % 4;
				flag1 = false; // flag는 왜있지?
			}
			if (nx2 < 0 || nx2 >= n || ny2 < 0 || ny2 >= n || board[nx2][ny2] == 1) { // 현수의 x , y좌표가 0미만이거나,
																						// n(땅의크기)이상이거나,
				// 보드내의 좌표에 1이 있으면 장애물이므로 방향전환해야함.
				d2 = (d2 + 1) % 4;
				flag2 = false; // flag는 왜있지?
			}

			if (flag1 == true) { // 현수의 flag가 true이면
				x1 = nx1; // nx1은 현수의 x좌표가 된다.
				y1 = ny1; // ny1은 현수의 y좌표가 된다.
			}
			if (flag2 == true) { // 강아지의 flag가 true이면
				x2 = nx2; // nx2는 강아지의 x좌표가 된다.
				y2 = ny2; // ny2는 강아지의 y좌표가 된다.
			}
			if (x1 == x2 && y1 == y2)
				break; // 현수와 강아지가 만나면 길을 그만찾고 집에돌아간다.break;

		}

		if (time >= 10000)
			return 0; // 시간이 10,000분이상이 되면 시간초과로 0을 리턴한다.
		return time;
	}

	public static void main(String[] args) {
		Q3 T = new Q3();
		int[][] arr1 = { { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 2, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 } };
		System.out.println(T.solution(arr1));
		int[][] arr2 = { { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0, 0, 2, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 3 } };
		System.out.println(T.solution(arr2));
	}
}