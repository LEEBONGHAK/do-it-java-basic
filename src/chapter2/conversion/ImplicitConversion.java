package chapter2.conversion;

public class ImplicitConversion {
    public static void main(String[] args) {
        // implicit conversion (묵시적 형변환) : 작은 수에서 큰 수로 덜 정밀한 수에서 더 절밀한 수로 대입되는 경우
        byte bNum = 10;
        int num = bNum;
        System.out.println(num);

        long lNum = 10;
        float fNum = lNum;
        System.out.println(fNum);

        /*
        * 1. num -> float implicit conversion
        * 2. fNum + num
        * 3. fNum + num -> double implicit conversion
        * */
        double dNum = fNum + num;
        System.out.println(dNum);
    }
}
