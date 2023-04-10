package ch03;

public class ch03_09_LogicalOperator {
    public static void main(String[] args) {
        int charCode = 'A'; //65

        if( (charCode >= 65) & (charCode <= 90)){
            System.out.println("대문자군요");
        }

        if( (charCode >= 97) && (charCode <= 122)){
            System.out.println("소문자군요");
        }

        if( !(charCode < 48) && !(charCode > 57)){
            System.out.println("0~9숫자군요");
        }

        int value = 6;

        if( (value % 2 == 0) | (value % 3 == 0)){
            System.out.println("2또는3의배수군요");
        }

        if( (value % 2 == 0) || (value % 3 == 0)){
            System.out.println("2또는3의배수군요");
        }

    }
}
