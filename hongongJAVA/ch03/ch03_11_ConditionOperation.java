package ch03;

public class ch03_11_ConditionOperation {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}
