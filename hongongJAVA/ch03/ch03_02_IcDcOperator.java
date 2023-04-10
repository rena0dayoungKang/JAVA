package ch03;

public class ch03_02_IcDcOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("--------------------------");
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("--------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("--------------------------");
        //z = ++x + y++;
        //위의 형식은 너무 복잡하고 가독성이 떨어진다
        ++x;
        z = x + y;
        y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);


    }
}
