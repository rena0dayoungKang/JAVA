package ch05;

import java.util.Scanner;

public class ch05_06 {
    public static void main(String[] args) {

        boolean run = true;
        int studentNum = 0;
        int[] scores  = new int[studentNum];
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------------");
            System.out.println("<선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생의 수를 입력 하세요 : ");
                studentNum = scanner.nextInt();

            } else if (selectNo == 2) {
                System.out.println("학생들의 점수를 각각 입력하세요 : ");
                for (int i = 0; i < studentNum; i++) {
                    scores[i] = scanner.nextInt();
                }
            } else if (selectNo == 3) {
                for(int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "] > " + scores[i]);
                }
            } else if (selectNo == 4) {
                for (int i = 0; i < scores.length; i++) {
                    int maxScore = 0; int sumScore = 0; double avgScore = 0;
                    if (maxScore < scores[i]) {
                        maxScore = scores[i];
                    }
                    sumScore += scores[i];
                    avgScore = (double) sumScore / scores.length;
                    System.out.println("최고 점수 : " + maxScore);
                    System.out.println("평균 점수 : " + avgScore);
                }
            } else if (selectNo == 5) {
                System.out.println("프로그램 종료.");
                System.out.close();
            }
        }


    }
}
