package ch02;

public class ch02_03_typeCasting {

    public static void main(String[] args) {

        // byte x = 10;
        // byte y = 20;
        // int sum = x + y;

        int i = 10;
        int j = 20;
        int sum = i + j;
        System.out.println(sum);

        // int x = 1;
        // int y = 2;
        // double result = x / y;
        // System.out.println(result); //print 0.0

        // 실수 연산에서의 자동 타입 변환
        int x = 1;
        int y = 2;
        // double result = (double) (x / y); //print 0.0
        double result = (double) x / y; // print 0.5
        System.out.println(result);

        char charValue1 = 'A';
        char charValue2 = 1;
        System.out.println(charValue1);
        System.out.println(charValue2);
        // char charValue3 = charValue1 + charValue2;
        int intValue2 = charValue1 + charValue2;
        System.out.println(intValue2); // print 66
        System.out.println((char) intValue2); // print B

        int intValue3 = 10;
        double doubleValue = intValue3 / 4.0;
        System.out.println(doubleValue);

        // +연산에서의 문자열 자동 타입 변환
        int value = 10 + 2 + 8;
        System.out.println(value);

        String str1 = 10 + 2 + "8";
        System.out.println(str1); // "12""8"

        String str2 = 10 + "2" + 8;
        System.out.println(str2);

        String str3 = "10" + 2 + 8;
        System.out.println(str3);

        String str4 = "10" + (2 + 8);
        System.out.println(str4);

        // 문자열을 기본 타입으로 강제 타입 변환
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean bvalue3 = Boolean.parseBoolean("true");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(bvalue3);

        String string1 = String.valueOf(10);
        String string2 = String.valueOf(3.14);
        String string3 = String.valueOf(true);
        // String string4 = String.valueOf(a);
        String string4 = String.valueOf('a');
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);

        double var1 = 3.5;
        double var2 = 2.7;
        // double result1 = var1 + var2; //6.2
        int result1 = (int) (var1 + var2); // 6
        System.out.println(result1);

        long longValue = 2L;
        float floatValue = 1.8f;
        double doubleValue1 = 2.5;
        String stringValue = "3.9";
        int result2 = (int) (longValue + floatValue + doubleValue1 + (int) Double.parseDouble(stringValue));
        System.out.println(result2);

    }

}
