package chapter2.conversion;

public class ExplicitConversion {
    public static void main(String[] args) {
        // explicit conversion (명시적 형변환) : 묵시적 형 변환의 반대의 경우 변환되는 자료형을 명시해야 함 자료의 손실이 발생할 수 있음
        int iNum = 1000;
        byte bNum = (byte) iNum;
        System.out.println(iNum);
        System.out.println(bNum);

        double dNum = 3.14;
        iNum = (int) dNum;
        System.out.println(iNum);

        float fNum = 0.9F;
        int num1 = (int) dNum + (int) fNum;
        int num2 = (int) (dNum + fNum);
        System.out.println(num1);
        System.out.println(num2);
    }
}
